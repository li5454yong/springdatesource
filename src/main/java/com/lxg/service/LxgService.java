package com.lxg.service;

import java.util.List;
import java.util.Map;

import com.lxg.entity.TestEntity;

/**
 * @author lxg
 *
 * 2016年9月4日下午6:09:46
 */
public interface LxgService {

	public void update(Map<String,Object> param);
	
	public List<TestEntity> getLxg();
}
