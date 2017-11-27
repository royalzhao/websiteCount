package com.ytzh.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ytzh.mapper.ZdtjMapper;
import com.ytzh.pojo.TjDate;
import com.ytzh.service.ZdtjService;
@Service
@Transactional
public class ZdtjServiceImpl implements ZdtjService{
	@Resource
	private ZdtjMapper zdtjMapper;
	public List<Map<String, Object>> zdtjQuery(TjDate tjDate) {
		
		return zdtjMapper.zdtjQuery(tjDate);
	}

}
