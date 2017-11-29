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
import com.ytzh.pojo.TjDate;
import com.ytzh.service.ZdtjService;

@Controller
public class ZdtjController {
	@Autowired
	private ZdtjService zdtjService;
	
	@RequestMapping(value="/zdtjQuery",method=RequestMethod.GET)
	@ResponseBody
	public  JSONArray pageViewAll(@ModelAttribute TjDate tjDate) throws IOException{
		//日各时段总访问量
		List<Map<String,Object>> pageViewAllByHourList= zdtjService.pageViewAllByHour(tjDate);		
		String pageViewAllByHourJson = JSON.toJSONString(pageViewAllByHourList);
		
		//日各时段独立访问量
		List<Map<String,Object>> IpcAllByHourList=zdtjService.IpcAllByHourList(tjDate);
		String IpcAllByHourJson = JSON.toJSONString(IpcAllByHourList);
		
		//装入jsonArray:  0:日各时段总访问量  pageViewAllByHourJson;1日各时段独立访问量 IpcAllByHourJson
		JSONArray jsonArray = new JSONArray();   
		jsonArray.add(0,pageViewAllByHourJson);
		jsonArray.add(1,IpcAllByHourJson);
		System.out.println(jsonArray);
		return jsonArray;
	}
}
