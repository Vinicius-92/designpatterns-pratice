package model;

public class Person {

    private String firstname;
    private String lastname;
    private String email;
    private Integer cpf;
    private String country;

    public Person(String firstname, String lastname, String email, Integer cpf, String country) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.cpf = cpf;
        this.country = country;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person: \n" +
                "First name ~> " + firstname + '\n' +
                "Last name ~> " + lastname + '\n' +
                "Email ~> " + email + '\n' +
                "CPF ~> " + cpf + '\n' +
                "Country ~> " + country;
    }
}
