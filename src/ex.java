public class ex {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        for (int index = 10; index >=0; index--) {
            System.out.println(x + " ");

            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}