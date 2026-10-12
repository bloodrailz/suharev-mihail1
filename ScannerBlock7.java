import java.util.Scanner;
public class ScannerBlock7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите свой балл 0-100");
		int ball = scanner.nextInt();
		String grade = (ball >= 90) ? "оценка 5" : (ball >= 75) ? "оценка 4" : (ball >= 60) ? "оценка 3" : "оценка 2";
		System.out.println(grade);
		scanner.close();

	}
}