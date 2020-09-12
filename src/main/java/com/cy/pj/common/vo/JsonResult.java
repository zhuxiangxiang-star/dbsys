package com.cy.pj.common.vo;

import java.io.Serializable;


import lombok.Data;
@Data
public class JsonResult implements Serializable{

	public JsonResult(Object object) {
		this.data=object;
		// TODO Auto-generated constructor stub
	}
	public JsonResult(Throwable e) {
		this.state=0;
		this.message=e.getMessage();
		
	}
	public JsonResult(String message) {
		this.message=message;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int state=1;
	private String message="ok";
	private Object data;
	
	

}
