package session_17_equals_hashcode_generics.challenges.challenge_7;

public class TestClass {
    public static void main(String[] args) {
        Entity entity1 = new Entity(12345, "Car1", 444);
        Entity entity2 = new Entity(12346, "Car1", 444);

        if (entity1.equals(entity2) || entity1.hashCode() == entity2.hashCode()) {
            System.out.println("Thous entities are both equal");
        } else {
            System.out.println("Thous entities are not equal");
            {
                System.out.println();
            }
        }
    }
}