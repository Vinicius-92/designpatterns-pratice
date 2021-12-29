package creational.builder.person;

import creational.builder.person.builder.PersonBuilder;

public class App {
    public static void main(String[] args) {
        var me = new PersonBuilder("Vinicius")
                .whitLastName("Augusto")
                .withPhoneNumber(996359084L)
                .withEmail("vinicius@gmail.com")
                .build();
        System.out.println(me);
    }
}
