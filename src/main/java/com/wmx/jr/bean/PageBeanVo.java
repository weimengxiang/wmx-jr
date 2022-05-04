package com.wmx.jr.bean;

import java.io.Serializable;
import java.util.List;

public class PageBeanVo implements Serializable {
    //当前页
    private int pageNum;
    //每页的记录数
    private int pageSize;
    //总页数
    private int pages;
    //总记录数
    private int total;
    //返回的当页数据
    private List<Object> resultList;
    //当页对应数据库中开始位置
    private int startRow;
    //当页结束对应数据库结束位置
    private int endRow;
    //升序 or 降序
    private String sort;

    public PageBeanVo() {
    }

    public PageBeanVo(int pageNum, int pageSize, int pages, int total, List<Object> resultList, int startRow, int endRow, String sort) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.pages = pages;
        this.total = total;
        this.resultList = resultList;
        this.startRow = startRow;
        this.endRow = endRow;
        this.sort = sort;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Object> getResultList() {
        return resultList;
    }

    public void setResultList(List<Object> resultList) {
        this.resultList = resultList;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
