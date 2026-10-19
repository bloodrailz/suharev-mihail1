import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицательное число для расчета факториала: ");
        int n = scanner.nextInt();
        try {
            int result = factorial(n);
            System.out.println("Факториал числа " + n + " равен: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("беб");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}