package session_4_java_operators_and_loops.challenges;

public class Challenge_7 {
    public static void main(String[] args) {

        int sideOne = 10;
        int sideTwo = 10;
        int sideThree = 25;

        String triangleShape = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" :
                        "Scalene";

        System.out.println("The triangle is: " + triangleShape);

    }
}
