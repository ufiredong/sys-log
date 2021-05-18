package com.zxx.core.mapper;

import com.zxx.core.model.SysLog;
import com.zxx.core.model.SysLogExample;
import mboog.support.mapper.ReadMapper;
import mboog.support.mapper.WriteMapper;
import mboog.support.model.NoKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLogMapper extends ReadMapper<NoKey, SysLog, SysLogExample>, WriteMapper<NoKey, SysLog, SysLogExample> {
}