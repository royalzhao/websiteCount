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
	//网站日各时段总访问量
	@Override
	public List<Map<String, Object>> pageViewAllByHour(TjDate tjDate) {
		// TODO Auto-generated method stub
		return zdtjMapper.pageViewAllByHour(tjDate);
	}
	@Override
	public List<Map<String, Object>> IpcAllByHourList(TjDate tjDate) {
		// TODO Auto-generated method stub
		return zdtjMapper.IpcAllByHourList(tjDate);
	}

}
