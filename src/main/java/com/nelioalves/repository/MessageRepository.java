package com.nelioalves.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nelioalves.entity.Message;

@RepositoryRestResource(collectionResourceRel="message", path="message")
public interface MessageRepository extends MongoRepository<Message, String> {
}
