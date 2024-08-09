package session_19_stream.challenges.Challenge_5;

import java.util.Arrays;
import java.util.List;

public class Exercise_5 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Joice", "Samuel", 30, 'F'),
                new Person("Abigail", "Thompson", 26, 'F'),
                new Person("Jonatan", "Thompson", 20, 'M'),
                new Person("Riley", "Jones", 12, 'M'),
                new Person("Maria", "Jamison", 11, 'F'),
                new Person("Lucas", "Oros", 12, 'M'),
                new Person("Marck", "Feels", 20, 'M'),
                new Person("Justin", "Square", 16, 'M')
        );
        List<String> resultList = persons.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.getFirstName() + " " + person.getAge())
                .sorted()
                .toList();

        System.out.println("The persons who are greater then  18 years old are: " + resultList);
    }
}