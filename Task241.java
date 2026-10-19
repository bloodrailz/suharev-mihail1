import java.util.Scanner;

public class Task241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        System.out.println("Результат работы метода printDown(" + n + "):");
        printDown(n);
        scanner.close();
    }
    public static void printDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDown(n - 1);
    }
}