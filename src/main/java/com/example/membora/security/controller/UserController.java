package com.example.membora.security.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.membora.basecontroller.BaseCrudController;
import com.example.membora.basemodel.Result;
import com.example.membora.security.model.User;
import com.example.membora.security.service.UserService;

@RestController
public class UserController implements BaseCrudController<User, String>{

	private Logger logger = LogManager.getLogger(UserController.class);
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	@Override
	public List<User> findAll() {
		try {

			return service.findAll();
		} catch (Exception e) {

			logger.error(" ", e);
		}
		return null;
	}

	@GetMapping("/user/{userId}")
	@Override
	public User findById(String id) {
		try {
			return service.findById(id);
		} catch (Exception e) {
		}

		return null;
	}

	@PostMapping("/user")
	@Override
	public Result<User> create(@RequestBody User t) {
		try {
			return service.create(t);
		} catch (Exception e) {

			logger.error("", e);
		}
		return null;
	}

	
	@PutMapping("/user")
	@Override
	public Result<User> update(User t) {
		try {

			return service.update(t);
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}

	@DeleteMapping("/user/{userId}")
	@Override
	public Result<User> delete(String id) {
		try {
			return service.delete(id);
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}

}
