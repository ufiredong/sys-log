package com.zxx.core.service;

import com.zxx.core.mapper.LogCountMapper;
import com.zxx.core.model.LogCount;
import com.zxx.core.model.LogCountExample;
import mboog.support.model.NoKey;
import mboog.support.service.ReadService;

public interface LogCountService extends ReadService<NoKey, LogCount, LogCountExample, LogCountMapper> {
}