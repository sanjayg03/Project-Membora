package com.example.membora.baseservice;

import java.util.List;

import com.example.membora.basemodel.Result;


public interface BaseService<T,T1>  {

	public List<T> findAll();
	public T findById(T1 id);
	public Result<T> create(T t);
	public Result<T> update(T t);
	public Result<T> delete(T1 id);
}
