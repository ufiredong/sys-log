package com.zxx.core.mapper;

import com.zxx.core.model.LogCount;
import com.zxx.core.model.LogCountExample;
import mboog.support.mapper.ReadMapper;
import mboog.support.model.NoKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogCountMapper extends ReadMapper<NoKey, LogCount, LogCountExample> {
}