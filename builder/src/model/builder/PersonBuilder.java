package model.builder;

import model.Person;

public class PersonBuilder {

    //Mandatory
    private String firstname;

    //Optional
    private String lastname;
    private String email;
    private Integer cpf;
    private String country;

    public PersonBuilder(String firstname) {
        this.firstname = firstname;
    }

    public PersonBuilder addLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public PersonBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder addCpf(Integer cpf) {
        this.cpf = cpf;
        return this;
    }

    public PersonBuilder addCountry(String country) {
        this.country = country;
        return this;
    }

    public Person createPerson() {
        return new Person(firstname, lastname, email, cpf, country);
    }
}
