package projectjuice;

import java.util.Scanner;

public class mainjuice {

	public static void main(String[] args) {
		System.out.println("Welcome to the Juice Vending Machine");
		System.out.println("1. Orange Juice (0.5 dinars)");
		System.out.println("2. Apple Juice (0.75 dinars)");
		System.out.println("3. Pomegranate Juice (1.0 dinars)");
		System.out.println("Choose the juice number:");
		juice();
	}

	public static void calculateFunds(double price, double amount) {
		if (amount >= price) {
			double juice = amount - price;
			System.out.println("Purchased Change:" + juice);

		} else {
			System.out.println("Insufficient funds, please try again");
		}
	}

	public static void juice() {
		Scanner scanner = new Scanner(System.in);
		int juice = scanner.nextInt();
		System.out.println("Enter the cash amount (in dinars):");
		double amount = scanner.nextDouble();

		switch (juice) {
		case 1:
			calculateFunds(0.50, amount);
			break;
		case 2:
			calculateFunds(0.75, amount);
			break;
		case 3:
			calculateFunds(1.0, amount);

			break;
		}
	}

}
