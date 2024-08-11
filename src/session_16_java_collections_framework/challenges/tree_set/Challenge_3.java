package session_16_java_collections_framework.challenges.tree_set;

import java.util.TreeSet;

public class Challenge_3 {
    public static void main(String[] args) {
        TreeSet<String> movieList1 = new TreeSet<>();

        movieList1.add("Harry potter");
        movieList1.add("The lord of the rings");
        movieList1.add("Hobbit");
        movieList1.add("Twilight");

        System.out.println("Book list 1" + movieList1);

        TreeSet<String> bookList2 = new TreeSet<>();

        movieList1.add("Batman vs Superman");
        movieList1.add("Tinker bell");
        movieList1.add("Scarface");
        movieList1.add("Godzilla");
        movieList1.add("Abracadabra");

        movieList1.addAll(bookList2);
        System.out.println("All books " + movieList1);
    }
}