package practice;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapUserExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Julia", "Smith", 25),
                new User("Marck", "Barker", 36),
                new User("Gloria", "Stevans", 30),
                new User("Martha", "Jhonson", 23),
                new User("Robert", "Smith", 31),
                new User("Johny", "Robinson", 28)
        );
        List<String> result = users.stream()
                .filter(user -> user.getAge() > 25)
                .map(user -> user.getFirstName())
                .toList();

        System.out.println(result);
    }
}
