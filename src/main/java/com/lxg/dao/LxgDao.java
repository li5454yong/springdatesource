package com.lxg.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lxg.entity.TestEntity;

/**
 * @author lxg
 *
 * 2016年9月4日下午3:35:10
 */
@Repository
public interface LxgDao {
	public void update(Map<String,Object> param);
	public List<TestEntity> getLxg();
}
