import model.Person;
import model.builder.PersonBuilder;

public class Program {

    public static void main(String[] args) {

        System.out.println("Creating person using builder");

        System.out.println("\nUsing all parameters");
        Person person = new PersonBuilder("Mike")
                .addLastname("Smith")
                .addEmail("mike@gmail.com")
                .addCpf(1213458428)
                .addCountry("Brazil")
                .createPerson();
        System.out.println(person);

        System.out.println("\nUsing only name");
        Person person2 = new PersonBuilder("Ada")
                .addLastname("Lovelace")
                .createPerson();
        System.out.println(person2);


    }
}
