package com.zxx.core.model;

import lombok.Data;

/**
 * @description:
 * @author: Andy
 * @time: 2021/4/17 22:34
 */
@Data
public class RestModel<T> {
    private Integer code = 0;
    private Long count;
    private T data;

    public RestModel() {
    }

    public RestModel(Long count,T data) {
        this.code = 0;
        this.data = data;
        this.count=count;
    }

}
