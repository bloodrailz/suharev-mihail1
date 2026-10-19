import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = digitSum(number);
        System.out.println("Сумма цифр числа: " + result);
        scanner.close();
    }
    public static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}