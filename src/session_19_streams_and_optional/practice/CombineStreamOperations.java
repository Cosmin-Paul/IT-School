package session_19_streams_and_optional.practice;

import java.util.Arrays;
import java.util.List;

public class CombineStreamOperations {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Julia", "Smith", 25),
                new User("Marck", "Barker", 36),
                new User("Martha", "Jhonson", 23),
                new User("Johny", "Robinson", 28)

        );
        List<String> resultList = users.stream()
                .filter(user -> user.getAge()<28)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .sorted()
                .toList();

        System.out.println(resultList);
    }
}
