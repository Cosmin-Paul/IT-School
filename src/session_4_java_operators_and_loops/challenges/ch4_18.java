package session_4_java_operators_and_loops.challenges;

public class ch4_18 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int a = 0; a < array.length; a++) {
            array[a] = a + 1;

            System.out.println("Array before decrement");

            for (int value : array) {
                System.out.println(value + " ");


            }



        }
    }
}
