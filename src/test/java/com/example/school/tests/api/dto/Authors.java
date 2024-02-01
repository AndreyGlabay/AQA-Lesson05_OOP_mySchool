package com.example.school.tests.api.dto; // (step 1.l) Create new package "dto";

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authors { // (step 1.m) In the "dto" package: create new java-class "Authors" for make DTO for the entity;
    // (step 1.n) implement variables according to the /Authors-GET-scheme;
    // (step 1.q) annotate variables with "@JsonProperty", add accessors, add toString;
    @JsonProperty
    private int id; // (step 5) restrict access to the field, with access modifier "private";
    @JsonProperty
    private int idBook; // (step 5) restrict access to the field, with access modifier "private";
    @JsonProperty
    private String firstName; // (step 5) restrict access to the field, with access modifier "private";
    @JsonProperty
    private String lastName; // (step 5) restrict access to the field, with access modifier "private";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
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

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", idBook=" + idBook +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
