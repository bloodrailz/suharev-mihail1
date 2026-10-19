import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс числа Фибоначчи n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("число n должно быть больше или равно 0.");
        } else {
            int result = fibonacci(n);
            System.out.println("Число Фибоначчи под номером " + n + " равно: " + result);
        }
        scanner.close();
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}