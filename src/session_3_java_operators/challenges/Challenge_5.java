package session_3_java_operators.challenges;

public class Challenge_5 {
    public static void main(String[] args) {
        int x = 12;

        x += 2;
        System.out.println("The compound addition assignment: " + x);
        x -= 2;
        System.out.println("The compound subtraction assignment: " + x);
        x *= 2;
        System.out.println("The compound multiplication assignment: " + x);
        x /= 2;
        System.out.println("The compound division assignment: " + x);
        x %= 2;
        System.out.println("The compound modulus assignment:" + x);
        x &= 2;
        System.out.println("The compound Bitwise & assigment: " + x);
        x ^= 2;
        System.out.println("The compound Bitwise ^ assigment: " + x);
        x |= 2;
        System.out.println("The compound Bitwise | assigment: " + x);
        x <<= 2;
        System.out.println("The compound left shift | assigment: " + x);
        x >>= 2;
        System.out.println("The compound right shift | assigment: " + x);
        x >>>= 2;
        System.out.println("The compound rght shift filled 0 | assigment: " + x);
    }
}
