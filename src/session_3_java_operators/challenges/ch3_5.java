package session_3_java_operators.challenges;

public class ch3_5 {
    public static void main(String[] args) {
        int w = 12;
        w += 2;

        System.out.println("The compound addition assignment: " + w);
        w -= 2;
        System.out.println("The compound subtraction assignment: " + w);
        w *= 2;
        System.out.println("The compound multiplication assignment: + w");
        w /= 2;
        System.out.println("The compound division assignment: " + w);
        w %= 2;
        System.out.println("The compound modulus assignment:" + w);
        w &= 2;
        System.out.println("The compound Bitwise & assigment: " + w);
        w ^= 2;
        System.out.println("The compound Bitwise ^ assigment: " + w);
        w |= 2;
        System.out.println("The compound Bitwise | assigment: " + w);
        w <<= 2;
        System.out.println("The compound left shift | assigment: " + w);
        w >>= 2;
        System.out.println("The compound right shift | assigment: " + w);
        w >>>= 2;
        System.out.println("The compound rght shift filled 0 | assigment: " + w);


    }
}
