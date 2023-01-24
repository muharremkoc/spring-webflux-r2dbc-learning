package com.webflux.springwebfluxr2dbclearning.controller;

import com.webflux.springwebfluxr2dbclearning.model.Person;
import com.webflux.springwebfluxr2dbclearning.service.PersonService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webflux/r2dbc")
public class PersonController {

    final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/create",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<Person> create(@RequestBody Mono<Person> person){
        return person.flatMap(personService::create);
    }

    @GetMapping(value = "/persons",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Person> getPersons(){
        return personService.getPersons();
    }

    @PutMapping(value = "/update/{id}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<Person> update(@PathVariable Integer id,@RequestBody Mono<Person> person){
        return personService.update(id, person);
    }

    @DeleteMapping(value = "/delete/{id}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<Void> delete(@PathVariable Integer id){
        return personService.delete(id);
    }
}
