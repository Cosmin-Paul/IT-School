package practice;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExemple {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Julia", "Smith", 25),
                new User("Marck", "Barker", 36),
                new User("Martha", "Jhonson", 23),
                new User("Johny", "Robinson", 28)
        );
        List<String> fullName = users.stream()
                .map(name -> name.getFirstName() + " " + name.getLastName())
                .toList();

        System.out.println(fullName);
    }

}
