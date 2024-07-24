package session_9_arrays.challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> studentList = new LinkedList<>();

        studentList.add("Alina Mihai");
        studentList.add("Tudor Marian");
        studentList.add("Corina Balint");
        studentList.add("Matei Stefanescu");
        studentList.add("Alexandra Tudor");
        studentList.add("Stefania Istoc");
        studentList.add("George Constantin");
        studentList.add("Paul Tanase");
        studentList.add("Beatrice Molnar");

        System.out.println("Enter your name: ");
        String studentName = scanner.nextLine();

        scanner.close();

        if (studentList.contains(studentName)) {
            studentList.remove(studentName);
            System.out.println("The student name " + studentName + "has been removed from the list.");
        } else {
            System.out.println("The student name " + studentName + " is not in the list.");
        }
        System.out.println("The student list is: " + studentName);
    }
}