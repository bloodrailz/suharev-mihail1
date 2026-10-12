import java.util.Scanner;
public class ScannerBlock4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число");
		double c1 = scanner.nextDouble();
		System.out.println("Введите операцию");
		char operation = scanner.next().charAt(0);
		System.out.println("Введите второе число");
		double c2 = scanner.nextDouble();
		switch (operation) {
		case '+':
			System.out.println("результат" + " " + (c1 + c2));
			break;
		case '-':
			System.out.println("результат" + " " + (c1 - c2));
			break;
		case '*':
			System.out.println("результат" + " " + (c1 * c2));
			break;
		case '/':
			if (c2 == 0) {
				System.out.println("На нолик не делится"); }
			else { System.out.println("результат" + " " + (c1 / c2));
		}
			break;
		default:
			System.out.println("неизвестная операция");	
		}
		scanner.close();
	}
}