package com.webflux.springwebfluxr2dbclearning.repository;

import com.webflux.springwebfluxr2dbclearning.model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person,Integer> {
}
