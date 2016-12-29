package com.nelioalves.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nelioalves.entity.User;

@RepositoryRestResource(collectionResourceRel="user", path="user")
public interface UserRepository extends MongoRepository<User, String> {

}
