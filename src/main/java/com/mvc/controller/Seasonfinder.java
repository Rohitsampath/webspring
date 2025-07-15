package com.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.service.ISeason;

@Controller
public class Seasonfinder {
	
	@Autowired
	private ISeason season;
	
	@RequestMapping("/")
	public String showHome() {
		
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String showSeason(Map<String, Object>map) {
		
		String msg=season.findSeason();
		
		String s1="good";
		String s2="mrng";
		String s3=s1.concat(s2);
		
		map.put("resultMsg", msg);
		
		return "display";
	}
}
