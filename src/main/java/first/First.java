package first;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();

		if (number < 35) {
			System.out.println("fail");
		} else if (number <= 45) {
			System.out.println("pass");
		} else if (number <= 60) {
			System.out.println("second");
		} else if (number <= 80) {
			System.out.println("first");
		} else if (number <= 100) {
			System.out.println("first");
		} else {
			System.out.println("error");

		}

	}
}