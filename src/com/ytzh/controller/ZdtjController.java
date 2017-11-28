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
import com.ytzh.pojo.TjDate;
import com.ytzh.service.ZdtjService;

@Controller
public class ZdtjController {
	@Autowired
	private ZdtjService zdtjService;
	
	@RequestMapping(value="/zdtjQuery",method=RequestMethod.GET)
	@ResponseBody
	public  String zdtjQuery(@ModelAttribute TjDate tjDate) throws IOException{
		List<Map<String,Object>> zdtjList= zdtjService.zdtjQuery(tjDate);		
		String json = JSON.toJSONString(zdtjList);
		
		System.out.println(json);
		return json;
	}
}
