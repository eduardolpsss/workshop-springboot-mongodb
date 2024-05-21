package com.wsexample.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wsexample.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}