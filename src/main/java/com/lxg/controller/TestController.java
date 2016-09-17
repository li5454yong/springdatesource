package com.lxg.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxg.entity.TestEntity;
import com.lxg.service.LxgService;

/**
 * @author lxg
 *
 * 2016年9月4日下午4:01:20
 */
@Controller
public class TestController {

	@Autowired
	private LxgService lxgService;
	
	@RequestMapping(value="update")
	public void update(){
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("id", 3);
		param.put("name", "lxg");
		lxgService.update(param);
	}
	
	@RequestMapping("get")
	public void get(){
		List<TestEntity> list = lxgService.getLxg();
		System.out.println(list.size());
	}
}
