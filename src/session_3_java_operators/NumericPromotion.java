package session_3_java_operators;

public class NumericPromotion {
    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 1000000L;

        //wraper classes
        long maxLongValue = Integer.MAX_VALUE;
        long minLongValue = Integer.MIN_VALUE;

        System.out.println("max long value" + maxLongValue);
        System.out.println("min long value" + minLongValue);

    }
}
