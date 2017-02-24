package com.cj.dao;

import java.io.Serializable;

import com.cj.common.bean.Pager4EasyUI;

public interface BaseDAO<T> {
	
	public T save(T t);

	public void delete(T t);
	
	public void update(T t);

	public T queryById(Class<?> clazz, Serializable id);

	public Pager4EasyUI<T> queryByPager(String beanName, Pager4EasyUI<T> pager);

	public long count();

}
