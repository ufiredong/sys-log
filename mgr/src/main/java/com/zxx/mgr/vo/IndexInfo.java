package com.zxx.mgr.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/5/2111:36
 */
@Component
@Data
public class IndexInfo {
    private long recordCount;
    private long computerCount;
    private long evtIdCount;
    private long sourceCount;
}
