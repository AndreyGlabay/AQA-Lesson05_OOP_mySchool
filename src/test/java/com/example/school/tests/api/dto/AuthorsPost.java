package com.example.school.tests.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

// (2.1.a) In the "dto" package: create new java-class "AuthorsPost" for make DTO for the entity;
public class AuthorsPost {
    @JsonProperty ("id")
    int id;
    @JsonProperty ("idBook")
    int idBook;
    @JsonProperty ("firstName")
    String firstName;
    @JsonProperty ("lastName")
    String lastName;


    // (2.1.b) Generate accessors and toString();
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

    public String getFirstNAme() {
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
        return "AuthorsPost{" +
                "id=" + id +
                ", idBook=" + idBook +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
