package com.zxx.mgr.vo;

import com.zxx.core.model.SysLog;
import lombok.Data;

import java.text.SimpleDateFormat;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/5/2110:53
 */
@Data
public class SysLogVo {
    private String evtDatetime;
    private String source;
    private Integer record;
    private String evtId;
    private String evtType;
    private String computer;
    private String cat;
    private String msg;
    public static SysLogVo toSysLogVo(SysLog sysLog){
        SysLogVo sysLogVo=new SysLogVo();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sysLogVo.setEvtDatetime(formatter.format(sysLog.getEvtDatetime()));
        sysLogVo.setSource(sysLog.getSource());
        sysLogVo.setRecord(sysLog.getRecord());
        sysLogVo.setEvtId(sysLog.getEvtId());
        sysLogVo.setComputer(sysLog.getComputer());
        sysLogVo.setCat(sysLog.getCat());
        sysLogVo.setMsg(sysLog.getMsg());
        sysLogVo.setEvtType(sysLog.getEvtType());
        return sysLogVo;
    }
}
