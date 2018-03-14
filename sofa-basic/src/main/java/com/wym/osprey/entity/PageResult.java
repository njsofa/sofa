package com.wym.osprey.entity;

import java.util.List;

public class PageResult<T> {
    private int total;

    public List<T> dataList;

    private Integer pageIndex;
    
	private Integer pageSize;
	
	public PageResult() {}

	public PageResult(int total, List<T> dataList) {
		this.total = total;
		this.dataList = dataList;
	}
	public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
    
}
