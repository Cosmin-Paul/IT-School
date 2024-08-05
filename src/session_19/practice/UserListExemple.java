package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class UserListExemple {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Julia", "Smith", 25),
                new User("Marck", "Barker", 36),
                new User("Martha", "Jhonson", 43)
        );
        users.forEach(System.out::println);
        users.stream().forEach(System.out::println);
    }
}