package session_17_equals_hashcode_generics.challenges.challenge_4;

public class TestSong {
    public static void main(String[] args) {

        Song test1 = new Song("Buleria", "David Bisbal", 300);
        Song test2 = new Song("Houdini", "Eminem", 188);

        if (test1.equals(test2) && test1.hashCode() == test2.hashCode()) {
            System.out.println("Objects are equal and have the same hashcode : " + test1.hashCode() + " " + test2.hashCode());
        } else {
            System.out.println(false);

        }
    }
}