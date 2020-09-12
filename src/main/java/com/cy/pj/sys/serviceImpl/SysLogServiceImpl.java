package com.cy.pj.sys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.common.bo.PageObject;
import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.sys.dao.SysLogDao;
import com.cy.pj.sys.pojo.SysLog;
import com.cy.pj.sys.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {
	@Autowired
	SysLogDao sysLogDao;

	@Override
	public PageObject<SysLog> findPageObjects(String username, Integer pageCurrent) {
		if (pageCurrent == null || pageCurrent < 1) {
			throw new IllegalArgumentException("当前页码不正确");
		}
		int rowCount = sysLogDao.getRowCount(username);
		if (rowCount == 0) {
			throw new ServiceException("系统没有查到对应数据");
		}
		int startIndex = 0;
		int pageSize = 5;
		List<SysLog> findPageObjects = sysLogDao.findPageObjects(username, startIndex, pageSize);

		return new PageObject<>(pageSize, rowCount, pageCurrent, findPageObjects);

	}

	
	@Override
	public int deleteObjects(Integer... ids) {
	    if(ids==null||ids.length==0)
	    	throw new IllegalArgumentException("请输入id的值");
	    int rows=sysLogDao.deleteObjects(ids);
	    if(rows==0)
	    	throw new ServiceException("记录可能已经不存在");
		return rows;
	}
}
