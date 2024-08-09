package session_19_stream.challenges;

public class Challenge_8 {
    public static void main(String[] args) {

        String myString = "Hello World, hello juniors!";
        long vowelCount = myString.chars()
                .filter(x -> "aeiouAEIOU".indexOf(x) != -1)
                .count();

        System.out.println("This sentence contains: " + vowelCount + " vowels");
    }
}
