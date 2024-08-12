package session_4_java_operators_and_loops.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge_18 {
    public static void main(String[] args) {

        int[] myArray = new int[5];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = index + 1;
        }

        System.out.print("The array before decrement: ");
        for (int numbers : myArray) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = myArray[index] - 1;
        }

        System.out.print("The array after decrement: ");
        for (int numbers : myArray) {
            System.out.print(numbers + " ");
            }
        }
    }