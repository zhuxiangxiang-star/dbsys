package com.cy.pj.sys.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.sys.pojo.SysLog;

@SpringBootTest
public class SysLogDaoTests {
	@Autowired
	SysLogDao sysLogDao;
	@Test
	public void test1() {
		System.out.println(sysLogDao.getRowCount("admin"));
	}
	@Test
	public void test2() {
		List<SysLog> findPageObjects = sysLogDao.findPageObjects(null, 0, 5);
		System.out.println(findPageObjects);
	}

}
