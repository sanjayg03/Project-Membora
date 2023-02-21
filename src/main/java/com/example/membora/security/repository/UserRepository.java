package com.example.membora.security.repository;

import org.springframework.stereotype.Repository;

import com.example.membora.baserepository.BaseRepository;
import com.example.membora.security.model.User;

@Repository
public interface UserRepository extends BaseRepository<User, String>{
 
}
