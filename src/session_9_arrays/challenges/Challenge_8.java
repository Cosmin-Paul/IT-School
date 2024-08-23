package session_9_arrays.challenges;

import java.util.Scanner;

public class Challenge_8 {
    public static void main(String[] args) {

        String[] movieList = {"X-Men", "Hobbit", "Spiderman", "Anabell", "Donald Duck", "The angry Birds", "Beauty & beast "};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie title: ");

        String searchTitle = scanner.nextLine();
        int positionInList = linearSearch(movieList, searchTitle);

        if (positionInList != -1) {
            System.out.println(searchTitle + " was found at position " + positionInList);
        } else {
            System.out.println(searchTitle + " was not found.");
        }
    }

    public static int linearSearch(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}