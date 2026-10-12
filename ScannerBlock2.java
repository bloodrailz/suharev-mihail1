import java.util.Scanner;
public class ScannerBlock2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите число");
		int chislo = scanner.nextInt();
		String result = (chislo % 2 == 0) ? "четное" : "нечетное";
		System.out.println(result);
		scanner.close();
	}
}