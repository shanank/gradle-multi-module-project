package com.training.gradle.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    private String name;
    private UUID personId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getPersonId() {
        return personId;
    }

    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    public Person(@JsonProperty("id") UUID personId,
                  @JsonProperty("name") String name) {
        this.name = name;
        this.personId = personId;
    }

}
