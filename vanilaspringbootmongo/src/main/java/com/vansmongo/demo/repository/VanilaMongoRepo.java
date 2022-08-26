package com.vansmongo.demo.repository;

import com.vansmongo.demo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VanilaMongoRepo extends MongoRepository<Person, Integer> {
}
