package com.cy.pj.sys.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.common.bo.PageObject;
import com.cy.pj.sys.pojo.SysLog;


@SpringBootTest
public class SysLogServiceTests {
	@Autowired
	SysLogService sysLogService;
	@Test
	public void test() {
		PageObject<SysLog> findPageObjects = sysLogService.findPageObjects("admin", 1);
		System.out.println(findPageObjects);
	}

}
