package com.zxx.mgr.controller;

import com.zxx.core.model.RestModel;
import com.zxx.core.model.SysLog;
import com.zxx.core.model.SysLogExample;
import com.zxx.core.service.SysLogService;
import mboog.support.bean.Page;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/5/1810:37
 */
@Controller
@RequestMapping("/log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    // 日志列表查询
    @RequestMapping(value = "/list")
    @ResponseBody
    public RestModel list(@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "limit", defaultValue = "20") Integer pageSize,
                          @RequestParam(value = "record", required = false) Integer record,
                          @RequestParam(value = "cat", required = false) String cat,
                          @RequestParam(value = "evtType", required = false) String evtType,
                          @RequestParam(value = "computer", required = false) String computer,
                          @RequestParam(value = "source", required = false) String source,
                          @RequestParam(value = "evtId", required = false) String evtId,
                          @RequestParam(value = "start", required = false) String start,
                          @RequestParam(value = "end", required = false) String end) {

        SysLogExample sysLogExample = new SysLogExample();
        SysLogExample.Criteria criteria = sysLogExample.ignoreNull().or();
        criteria
                .andCatLike("%{}%", cat)
                .andRecordEqualTo(record)
                .andEvtTypeEqualTo(evtType)
                .andComputerLike("%{}%", computer)
                .andSourceLike("%{}%", source)
                .andEvtIdEqualTo(evtId);
        if (!StringUtils.isBlank(start) && !StringUtils.isBlank(end)) {
            criteria.andEvtDatetimeBetween(
                    LocalDate.parse(start, DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay(),
                    LocalDate.parse(end, DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay())
            ;
        }
        Page<SysLog> sysLogPage = sysLogService.selectPageByExample(sysLogExample, pageNum, pageSize);

        return new RestModel(sysLogPage.getTotal(), sysLogPage.getData());

    }


    // 日志详情查询
    @RequestMapping(value = "/logInfo")
    @ResponseBody
    public RestModel logInfo(@RequestParam(value = "record", required = false) Integer record,
                             @RequestParam(value = "source", required = false) String source
    ) {

        SysLogExample sysLogExample = new SysLogExample();
        SysLogExample.Criteria criteria = sysLogExample.ignoreNull().or();
        criteria
                .andRecordEqualTo(record)
                .andSourceEqualTo(source);


        SysLog sysLog = sysLogService.selectByExampleSingleResult(sysLogExample);

        return new RestModel(null, sysLog);

    }


    // 首页统计信息
    @RequestMapping(value = "/indexInfo")
    @ResponseBody
    public RestModel indexInfo(
    ) {

        List<SysLog> sysLogs = sysLogService.selectByExample(new SysLogExample());
        List list = new ArrayList();
        Map<Integer, Long> recordCount = sysLogs.stream().collect(Collectors.groupingBy(SysLog::getRecord, Collectors.counting()));
        Map<String, Long> computerCount = sysLogs.stream().collect(Collectors.groupingBy(SysLog::getComputer, Collectors.counting()));
        Map<String, Long> evtIdCount = sysLogs.stream().collect(Collectors.groupingBy(SysLog::getEvtId, Collectors.counting()));
        Map<String, Long> sourceCount = sysLogs.stream().collect(Collectors.groupingBy(SysLog::getSource, Collectors.counting()));
        list.add(recordCount);
        list.add(computerCount);
        list.add(evtIdCount);
        list.add(sourceCount);
        return new RestModel(null, list);

    }


}
