import java.util.Random;
import java.util.Scanner;
public class BlockScanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ch;
        do {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Поздороваться");
            System.out.println("2. Показать случайное число");
            System.out.println("0. Выйти");
            System.out.print("Выберите пункт меню: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("салам");
                    break;
                case 2:
                    int randomNumber = random.nextInt(100); // Случайное число от 0 до 99
                    System.out.println("Случайное число: " + " " + randomNumber);
                    break;
                case 0:
                    System.out.println("пока беб");
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        } while (ch != 0);
        scanner.close();
    }
}