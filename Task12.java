import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int result = getGCD(num1, num2);
        System.out.println("НОД: " + result);
        scanner.close();
    }
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
	}
}