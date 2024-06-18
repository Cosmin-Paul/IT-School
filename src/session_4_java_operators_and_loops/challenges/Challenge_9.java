package session_4_java_operators_and_loops.challenges;

public class Challenge_9 {
    public static void main(String[] args) {

        //varianta a
        String countryOne = "USA";
        String country2 = "USA";
        String country3 = "UK";

        boolean compCountryes = countryOne.equals(country2);
        System.out.println("The both countries are: " + compCountryes);

        boolean cCountryes = countryOne.equals(country3);
        System.out.println("The both countries are:" + cCountryes);

        //varianta b

        if (countryOne.equals(country3)) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}
