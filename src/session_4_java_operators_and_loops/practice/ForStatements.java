package session_4_java_operators_and_loops.practice;

public class ForStatements {

    public static void main(String[] args) {
        printNumbers(10);

        int[] array = {1, 7, 3, 9, 34};
        printArray(array);
    }

    public static void printNumbers(int number) {
        for (int index = 0; index < number; index++) {
            System.out.println(index);
        }
    }

    public static void printArray(int[] numbersArray) {
        //numbersArray {1, 7, 3, 9, 34}
        for (int number : numbersArray) {
            System.out.println();
        }

    }
}
