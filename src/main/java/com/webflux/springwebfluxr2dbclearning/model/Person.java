package com.webflux.springwebfluxr2dbclearning.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("persons")
public class Person {


    @Id
    private Integer id;

    String firstName;

    String lastName;

    public Person() {
    }

    public Person(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
