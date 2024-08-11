package session_17_equals_hashcode_generics.challenges.challenge_5;

public class TestProduct {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 3999, 177588L);
        Product product2 = new Product("Printer", 1990, 15655L);

        if (product1.equals(product2) || product1.hashCode() == product2.hashCode()) {
            System.out.println("Products are equal and have the same hashcode");
        } else {
            System.out.println("Thouse products are not equals");
        }
    }
}