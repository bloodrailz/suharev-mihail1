import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = reverseNumber(number);
        System.out.println("Перевернутое число: " + result);
        scanner.close();
    }
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit;
            number /= 10;                 
        }
        return reversed;
    }
}