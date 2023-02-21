package com.example.membora.basecontroller;

import java.util.List;

import com.example.membora.basemodel.Result;

public interface BaseCrudController<T, T1> extends BaseRestController {

	public List<T> findAll();

	public T findById(T1 id);

	public Result<T> create(T t);

	public Result<T> update(T t);

	public Result<T> delete(T1 id);
}
