package com.example.membora.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.membora.basecontroller.BaseCrudController;
import com.example.membora.basemodel.Result;
import com.example.membora.security.model.Customer;
import com.example.membora.security.service.CustomerService;

@RestController
public class CustomerController implements BaseCrudController<Customer, String> {

	private Logger logger = LogManager.getLogger(CustomerController.class);
	@Autowired
	private CustomerService service;

	@GetMapping("/customer")
	@Override
	public List<Customer> findAll() {
		try {

			return service.findAll();
		} catch (Exception e) {

			logger.error(" ", e);
		}
		return null;
	}

	@GetMapping("/customer/{customerId}")
	@Override
	public Customer findById(String id) {
		try {
			return service.findById(id);
		} catch (Exception e) {
		}

		return null;
	}

	@PostMapping("/customer")
	@Override
	public Result<Customer> create(@RequestBody Customer t) {
		try {
			return service.create(t);
		} catch (Exception e) {

			logger.error("", e);
		}
		return null;
	}

	@PutMapping("/customer")
	@Override
	public Result<Customer> update(Customer t) {
		try {

			return service.update(t);
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}

	@DeleteMapping("/customer/{customerId}")
	@Override
	public Result<Customer> delete(String id) {
		try {
			return service.delete(id);
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}

}
