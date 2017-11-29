package com.ytzh.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ytzh.pojo.FwmxPojo;
import com.ytzh.pojo.TjDate;
import com.ytzh.service.ZdtjService;

@Controller
public class ZdtjController {
	@Autowired
	private ZdtjService zdtjService;
	/***
	 * 访问量统计
	 * 返回JSONArray
	 * */
	@RequestMapping(value="/zdtjQuery",method=RequestMethod.GET)
	@ResponseBody
	public  String pageViewCountAll(@ModelAttribute TjDate tjDate) throws IOException{
		//日各时段总访问量
		String pageViewAllByHourJson= zdtjService.pageViewAllByHour(tjDate);		
		
		//日各时段独立访问量
		String IpcAllByHourJson=zdtjService.IpcAllByHourList(tjDate);
		
		//昨日访问数
		String countAllByYesterdayJson=zdtjService.countAllByYesterday(tjDate);
		
		
		//装入jsonArray:  0:日各时段总访问量  pageViewAllByHourJson;1日各时段独立访问量 IpcAllByHourJson
		JSONArray jsonArray = new JSONArray();   
		jsonArray.add(0,pageViewAllByHourJson);
		jsonArray.add(1,IpcAllByHourJson);
		jsonArray.add(2,countAllByYesterdayJson);
		
		return jsonArray.toJSONString();
//		for(Map map:IpcAllByHourList){
//			pageViewAllByHourList.add(map);
//		}
//		String pageViewAllByHourJson = JSON.toJSONString(pageViewAllByHourList);
//		return pageViewAllByHourJson;
	}
	
	/****
	 * 
	 * 访问明细添加*/
	@RequestMapping(value="/fwmxAdd",method=RequestMethod.POST)
	@ResponseBody
	public String FwmxAdd(@ModelAttribute FwmxPojo fwmx){
		System.out.println(111);
		zdtjService.FwmxSave(fwmx);
		return "ok";
	}
}
