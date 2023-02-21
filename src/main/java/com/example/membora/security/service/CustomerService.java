package com.example.membora.security.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.membora.basemodel.Result;
import com.example.membora.baseservice.BaseService;
import com.example.membora.security.model.Customer;
import com.example.membora.security.repository.CustomerRepository;

@Service
public class CustomerService implements BaseService<Customer, String> {

	private Logger logger = LogManager.getLogger(CustomerService.class);

	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> findAll() {
		try {
			return repository.findAll();
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}

	@Override
	public Customer findById(String id) {
		try {
			Optional<Customer> cus = repository.findById(id);
			if (cus.isPresent()) {
				return cus.get();
			}
		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public Result<Customer> create(Customer t) {
		Result<Customer> result = new Result<>();
		try {
			
			t.setCustomerId(System.currentTimeMillis()+"");
			t.setCreatedOn(new Date());	
			Customer c = repository.save(t);
			result.setCode("0000");
			result.setMessage("successfully created");
			result.setData(c);
			return result;
		} catch (Exception e) {
			logger.error("", e);
		}

		return null;
	}

	@Override
	public Result<Customer> update(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<Customer> delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
