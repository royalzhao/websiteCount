package com.ytzh.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.ytzh.mapper.ZdtjMapper;
import com.ytzh.pojo.FwmxPojo;
import com.ytzh.pojo.TjDate;
import com.ytzh.service.ZdtjService;
@Service
@Transactional
public class ZdtjServiceImpl implements ZdtjService{
	@Resource
	private ZdtjMapper zdtjMapper;
	/**
	 * 网站日各时段总访问量**/
	@Override
	public String pageViewAllByHour(TjDate tjDate) {
		List<Map<String,Object>> pageViewAllByHourList= zdtjMapper.pageViewAllByHour(tjDate);		
		String pageViewAllByHourJson = JSON.toJSONString(pageViewAllByHourList);
		return pageViewAllByHourJson;
	}
	/**
	 网站日各时段独立访问量**/
	@Override
	public String IpcAllByHourList(TjDate tjDate) {
		List<Map<String,Object>> IpcAllByHourList=zdtjMapper.IpcAllByHourList(tjDate);
		String IpcAllByHourJson = JSON.toJSONString(IpcAllByHourList);
		return IpcAllByHourJson;
	}
	
	/**
	 * 明细添加
	 * */
	@Override
	public void FwmxSave(FwmxPojo fwmx) {
		// TODO Auto-generated method stub
		zdtjMapper.FwmxSave(fwmx);
	}
	/**
	 * 昨日访问数*/
	@Override
	public String countAllByYesterday(TjDate tjDate) {
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		//日总访问数
		Map<String, Object> pageViewByDay= zdtjMapper.pageViewByDay(tjDate);
		//日独立访问数
		Map<String, Object> IpcAllByDay=zdtjMapper.IpcAllByDay(tjDate);
		
		list.add(pageViewByDay);
		list.add(IpcAllByDay);
		
		String countAllByYesterdayJson = JSON.toJSONString(list);
		
		return countAllByYesterdayJson ;
	}
	

}
