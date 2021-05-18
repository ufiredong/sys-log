package com.zxx.core.service;

import com.zxx.core.mapper.SysLogMapper;
import com.zxx.core.model.SysLog;
import com.zxx.core.model.SysLogExample;
import mboog.support.model.NoKey;
import mboog.support.service.ReadService;
import mboog.support.service.UpsertService;
import mboog.support.service.WriteService;

public interface SysLogService extends ReadService<NoKey, SysLog, SysLogExample, SysLogMapper>, WriteService<NoKey, SysLog, SysLogExample, SysLogMapper>, UpsertService<NoKey, SysLog, SysLogExample, SysLogMapper> {
}