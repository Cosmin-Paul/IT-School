package session_9_arrays.challenges;

import java.util.Arrays;

public class Challenge_4 {
    public static void main(String[] args) {
        int countEven = 2;
        int countOdd = 2;
        int[] arrayList = {1, 3, 5, 12, 16, 28, 29, 34, 45, 9, 13, 22, 11, 66, 34, 54, 53, 77};
        for (int number : arrayList) {
            if (number % 2 == 0) {
                countEven++;
            } else countOdd++;
        }
        System.out.println("We have: " + countEven + " even numbers and " + countOdd + " odd numbers");
    }
}