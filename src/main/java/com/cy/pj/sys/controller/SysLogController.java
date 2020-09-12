package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.common.bo.PageObject;
import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.sys.pojo.SysLog;
import com.cy.pj.sys.service.SysLogService;

@Controller
@RequestMapping("/log/")
public class SysLogController {
	@Autowired
	SysLogService sysLogService;
	//分页请求处理方法
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String username,Integer pageCurrent) {
		PageObject<SysLog> PageObjects = sysLogService.findPageObjects(username, pageCurrent);
		return new JsonResult(PageObjects);
		
	}
	@RequestMapping("doDeleteObjects")
	  @ResponseBody
	  public JsonResult doDeleteObjects(Integer...ids){
		  sysLogService.deleteObjects(ids);
		  return new JsonResult("delete ok");
	  }

	

}
