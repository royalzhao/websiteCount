package com.ytzh.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.alibaba.fastjson.JSON;
import com.ytzh.pojo.TjDate;
import com.ytzh.service.ZdtjService;

@Controller
@RequestMapping("/Zdtj")
public class ZdtjController {
	@Autowired
	private ZdtjService zdtjService;
	
	@RequestMapping("/zdtjQuery")
	public void zdtjQuery(HttpServletRequest request,HttpServletResponse response,TjDate tjDate) throws IOException{
		tjDate=new TjDate();
		tjDate.setFDate("2017-11-27");
		List<Map<String,Object>> zdtjList= zdtjService.zdtjQuery(tjDate);
		System.out.println(zdtjList);
		
		String json = JSON.toJSONString(zdtjList);
	    //取得流向JSP传递数据    
	    PrintWriter out = response.getWriter();
	    out.print(json);
		System.out.println(json);
		
	}
}
