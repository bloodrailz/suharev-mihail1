import java.util.Scanner;
public class ScannerBlock1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите ваш возраст");
		int age = scanner.nextInt();
		String result = (age >= 18) ? "доступ разрешен" : "доступ запрещен жи есть";
		System.out.println(result);
		scanner.close();

	}
}
// import java.util.Scanner;

// public class AgeCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Введите возраст: ");
//         int age = scanner.nextInt();
        
        
//         String message = (age >= 18) ? "Доступ разрешен" : "Доступ запрещен";
        
//         System.out.println(message);
        
//         scanner.close();
//     }
// }