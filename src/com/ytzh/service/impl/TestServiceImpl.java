package com.ytzh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.ytzh.mapper.TestMapper;
import com.ytzh.pojo.FwmxPojo;
import com.ytzh.service.TestService;
@Service
@Transactional
public class TestServiceImpl implements TestService{
	@Resource
	private TestMapper testMapper;
	public void insert(FwmxPojo fwmx) {
		testMapper.insert(fwmx);
	}
	
}
