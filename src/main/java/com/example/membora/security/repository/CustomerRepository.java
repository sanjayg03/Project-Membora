package com.example.membora.security.repository;

import org.springframework.stereotype.Repository;

import com.example.membora.baserepository.BaseRepository;
import com.example.membora.security.model.Customer;

@Repository
public interface CustomerRepository extends BaseRepository<Customer, String> {

}
