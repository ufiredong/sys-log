package com.zxx.core.service.impl;

import com.zxx.core.mapper.SysLogMapper;
import com.zxx.core.model.SysLog;
import com.zxx.core.model.SysLogExample;
import com.zxx.core.service.SysLogService;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import mboog.support.model.NoKey;
import mboog.support.service.ServiceSupport;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl extends ServiceSupport<NoKey, SysLog, SysLogExample, SysLogMapper> implements SysLogService {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table log
     *
     * @mbg.generated
     */
    @Resource
    private SysLogMapper sysLogMapper;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated
     */
    @PostConstruct
    private void initService() {
        super.mapper = sysLogMapper;
    }
}