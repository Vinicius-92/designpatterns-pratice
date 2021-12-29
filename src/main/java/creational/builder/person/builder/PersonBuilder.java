package creational.builder.person.builder;

import creational.builder.person.Person;

public class PersonBuilder {
    private String name;
    private String lastName;
    private Long phoneNumber;
    private String email;

    public PersonBuilder(String name) {
        this.name = name;
    }

    public PersonBuilder whitLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withPhoneNumber(Long number) {
        this.phoneNumber = number;
        return this;
    }

    public PersonBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public Person build() {
        return new Person(name, lastName, phoneNumber, email);
    }
}
