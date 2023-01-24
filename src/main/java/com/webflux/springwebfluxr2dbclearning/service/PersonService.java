package com.webflux.springwebfluxr2dbclearning.service;

import com.webflux.springwebfluxr2dbclearning.dto.PersonDto;
import com.webflux.springwebfluxr2dbclearning.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {

    Mono<Person> create(Person person);

    Flux<Person> getPersons();

    Mono<Person> update(Integer id, Mono<Person> person);

    Mono<Void> delete(Integer id);


}
