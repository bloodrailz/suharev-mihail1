import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер таблицы умножения: ");
        int size = scanner.nextInt();
        umnozhenie(size);
        scanner.close();
    }  
    public static void umnozhenie(int size) {
        if (size <= 0) {
            System.out.println("Размер таблицы должен быть больше нуля");
            return;
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}