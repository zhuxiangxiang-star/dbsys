package com.cy.pj.common.bo;

import java.io.Serializable;
import java.util.List;


import lombok.Data;
@Data
public class PageObject<a> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pageSize;
	private Integer rowCount;
	private Integer pageCurrent;
	private Integer pageCount;
	private List<a> records;
	public PageObject(Integer pageSize, Integer rowCount, Integer pageCurrent, List<a> records) {
		super();
		this.pageSize = pageSize;
		this.rowCount = rowCount;
		this.pageCurrent = pageCurrent;
		this.pageCount = (this.rowCount-1)/pageSize+1;
		this.records = records;
	}

	

	
	

}
