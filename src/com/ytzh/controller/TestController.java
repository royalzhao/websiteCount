package com.ytzh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ytzh.pojo.FwmxPojo;
import com.ytzh.service.TestService;

@Controller
@RequestMapping("/testController")
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/sjtj")
	public void test(HttpServletRequest request,HttpServletResponse response,FwmxPojo fwmx){
		System.out.println(fwmx);
		testService.insert(fwmx);
	}
}
