package session_19_streams_and_optional.challenges;

import java.util.stream.IntStream;

public class Challenge_3 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100)
                .filter(n -> isPrime(n))
                .forEach(System.out::println);
    }

    public static boolean isPrime(int numbers) {
        if (numbers <= 1) {
            return false;
        }
        if (numbers <= 3) {
            return true;
        }
        if (numbers % 2 == 0 || numbers % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= numbers) {
            if (numbers % i == 0 || numbers % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        System.out.println(numbers);
        return true;
    }
}