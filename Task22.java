import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("число n должно быть больше или равно 1.");
        } else {
            int result = sum(n);
            System.out.println("Сумма чисел от 1 до " + n + " равна: " + result);
        }
        scanner.close();
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}