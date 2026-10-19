public class Task26 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10};
        System.out.println("sumArray(numbers, 0)" + sumArray(numbers, 0));
        System.out.println("sumArray(numbers, 1)" + sumArray(numbers, 1));
        System.out.println("sumArray(numbers, 2)" + sumArray(numbers, 2));
    }
    public static int sumArray(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumArray(numbers, index + 1);
    }
}