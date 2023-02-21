package com.example.membora.baserepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, T1> extends MongoRepository<T, T1> {

}
