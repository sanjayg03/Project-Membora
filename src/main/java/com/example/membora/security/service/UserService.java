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
import com.example.membora.security.model.User;
import com.example.membora.security.repository.UserRepository;

@Service
public class UserService implements BaseService<User, String> {

	private Logger logger = LogManager.getLogger(UserService.class);

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAll() {
		try {
			return repository.findAll();
		} catch (Exception e) {
			logger.error("", e);
		}
		return null;
	}

	@Override
	public User findById(String id) {
		try {
			Optional<User> cus = repository.findById(id);
			if (cus.isPresent()) {
				return cus.get();
			}
		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public Result<User> create(User t) {
		Result<User> result = new Result<>();
		try {

			t.setUserId(System.currentTimeMillis() + "");
			t.setCreatedOn(new Date());
			User c = repository.save(t);
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
	public Result<User> update(User t) {
		Result<User> result = new Result<>();
		try {
          Optional<User> optional=repository.findById(t.getUserId());
          if(optional.isPresent()) {
        	  
        	  User use=new User();
        	  use.setBusinessName(t.getBusinessName());
        	  use.setAddress(t.getAddress());
        	  use.setBusinessType(t.getBusinessType());
        	  use.setDateOfBirth(t.getDateOfBirth());
        	  use.setFirstName(t.getFirstName());
        	  use.setLastName(t.getLastName());
        	  use.setPhoneNumber(t.getPhoneNumber());
        	  
        	  User u=repository.save(use);
        	  result.setCode("0000");
        	  result.setData(u);
        	  result.setMessage("successfully updated");
        	  return result;
          }
			
		} catch (Exception e) {

			logger.error("",e);
		}
		return null;
	}

	@Override
	public Result<User> delete(String id) {
		
		return null;
	}

}
