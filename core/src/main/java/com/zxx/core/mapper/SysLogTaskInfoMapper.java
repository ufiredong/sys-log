package com.zxx.core.mapper;

import com.zxx.core.model.SysLogTaskInfo;
import com.zxx.core.model.SysLogTaskInfoExample;
import mboog.support.mapper.ReadMapper;
import mboog.support.mapper.WriteMapper;
import mboog.support.model.NoKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLogTaskInfoMapper extends ReadMapper<NoKey, SysLogTaskInfo, SysLogTaskInfoExample>, WriteMapper<NoKey, SysLogTaskInfo, SysLogTaskInfoExample> {
}