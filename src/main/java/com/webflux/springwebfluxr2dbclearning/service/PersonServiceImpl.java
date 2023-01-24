package com.webflux.springwebfluxr2dbclearning.service;

import com.webflux.springwebfluxr2dbclearning.model.Person;
import com.webflux.springwebfluxr2dbclearning.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.created;

@Service
public class PersonServiceImpl implements PersonService{

    final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Mono<Person> create(Person person) {
        return personRepository.save(person);

    }

    @Override
    public Flux<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public Mono<Person> update(Integer id, Mono<Person> person) {
        return this.personRepository.findById(id)
                .flatMap(p -> person.map(u -> {
                    p.setFirstName(u.getFirstName());
                    p.setLastName(u.getLastName());
                    return p;
                }))
                .flatMap(p -> this.personRepository.save(p));
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return personRepository.deleteById(id).share();
    }
}
