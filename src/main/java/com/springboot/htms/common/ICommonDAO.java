package com.springboot.htms.common;

import java.util.List;

public interface ICommonDAO<T> {

	public T save(T t);
	public List<T> getAll();
	public T getByCode(String code);
	public T update(T t);
	public T delete(T t);
	
}
