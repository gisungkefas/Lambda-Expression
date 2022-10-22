import org.example.Enum.Gender;
import org.example.Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("Kefas", Gender.MALE),
                new Person("Mertin", Gender.MALE),
                new Person("Lisa", Gender.FEMALE),
                new Person("Peace",Gender.FEMALE),
                new Person("Sarah", Gender.FEMALE)
        );

        System.out.println("// Imperative Approach");
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(Gender.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        System.out.println("\n//Declarative Approach for Females");
        people.stream().filter(person -> Gender.FEMALE.equals(person.getGender()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n//Declarative Approach for Males");
        people.stream().filter(person -> Gender.MALE.equals(person.getGender()))
                .collect(Collectors.toList()).
                forEach(System.out::println);


    }

}