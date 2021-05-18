package com.zxx.core.service;

import com.zxx.core.mapper.SysLogTaskInfoMapper;
import com.zxx.core.model.SysLogTaskInfo;
import com.zxx.core.model.SysLogTaskInfoExample;
import mboog.support.model.NoKey;
import mboog.support.service.ReadService;
import mboog.support.service.UpsertService;
import mboog.support.service.WriteService;

public interface SysLogTaskInfoService extends ReadService<NoKey, SysLogTaskInfo, SysLogTaskInfoExample, SysLogTaskInfoMapper>, WriteService<NoKey, SysLogTaskInfo, SysLogTaskInfoExample, SysLogTaskInfoMapper>, UpsertService<NoKey, SysLogTaskInfo, SysLogTaskInfoExample, SysLogTaskInfoMapper> {
}