package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge_2 {
    public static void main(String[] args) {

        List<String> toolBox = new ArrayList<>(Arrays.asList("Hammer", "nails", "scissors", "chainsaw", "oil", "screwdriver"));
        toolBox.add("lever");

        System.out.println(toolBox);
    }
}