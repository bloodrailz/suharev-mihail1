import java.util.Scanner;
public class ScannerBlock6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pass;
		do {
			System.out.println("Ввод пароля");
			pass = scanner.nextLine();
		} while (!pass.equals("java123"));
		System.out.println("Вход выполнен");
		scanner.close();
	}
}