package com.zxx.core.model;

import lombok.Data;
import mboog.support.bean.Page;

import java.util.List;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/4/2113:50
 */
@Data
public class PageDto<T> {
    private long pageNo;
    private long pageSize;
    private long total;
    private long current;
    private long totalPage;
    private List<T> data;

    public static PageDto toPageDto(Page page) {
        PageDto pageDto = new PageDto<>();
        pageDto.setPageNo(page.getPageNo());
        pageDto.setPageSize(page.getPageSize());
        pageDto.setTotal(page.getTotal());
        pageDto.setCurrent(page.getCurrent());
        pageDto.setTotalPage(page.getTotalPage());
        pageDto.setData(page.getData());
        return pageDto;
    }
}
