package com.zxx.mgr.task;

import com.zxx.core.model.SysLog;
import com.zxx.core.model.SysLogExample;
import com.zxx.core.model.SysLogTaskInfo;
import com.zxx.core.model.SysLogTaskInfoExample;
import com.zxx.core.service.SysLogService;
import com.zxx.core.service.SysLogTaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/5/1814:22
 */
@Component
public class LogTask {
    @Autowired
    private SysLogService sysLogService;
    @Autowired
    private SysLogTaskInfoService sysLogTaskInfoService;

    @Scheduled(cron = "0/30 * * * * ?")
    public void runTask() {
        List<SysLogTaskInfo> sysLogTaskInfos = sysLogTaskInfoService.selectByExample(new SysLogTaskInfoExample());
        sysLogService.deleteByExample(new SysLogExample());
        List<SysLog> sysLogs=new ArrayList<>(sysLogTaskInfos.size());
        sysLogTaskInfos.stream().forEach(log->{
            SysLog sysLog=new SysLog();
            sysLog.setCat(log.getCat());
            sysLog.setComputer(log.getComputer());
            sysLog.setEvtDatetime(LocalDateTime.parse(log.getEvtDatetime(),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            sysLog.setEvtType(log.getEvtType());
            sysLog.setEvtId(log.getEvtId());
            sysLog.setMsg(log.getMsg());
            sysLog.setRecord(log.getRecord());
            sysLogs.add(sysLog);
        });
        sysLogService.batchInsert(sysLogs);
    }
}
