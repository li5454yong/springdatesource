package com.lxg.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxg.dao.LxgDao;
import com.lxg.entity.TestEntity;
import com.lxg.service.LxgService;

/**
 * @author lxg
 *
 * 2016年9月4日下午4:18:01
 */
@Service
public class LxgServiceImpl implements LxgService {

	@Resource
	private LxgDao lxgDao;
	
	public void update(Map<String,Object> param){
		lxgDao.update(param);
	}
	
	public List<TestEntity> getLxg(){
		return lxgDao.getLxg();
	}
}
