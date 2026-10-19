public class Task11 {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        } return result;
    }
}


