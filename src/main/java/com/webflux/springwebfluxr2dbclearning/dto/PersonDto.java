package com.webflux.springwebfluxr2dbclearning.dto;

import liquibase.pro.packaged.S;

public class PersonDto {

    private String firstName;
    private String lastName;

    public PersonDto() {
    }

    public PersonDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
