package Atm_simulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Atmintefaceclass a = new Atmintefaceclass();
		int atmnumber = 12345;
		int atmpin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Atm Machine");
		System.out.println("enter your atmnumber");
		int number = sc.nextInt();

		System.out.println("enter your atmpin");
		int pin = sc.nextInt();

		if ((atmnumber == number) && (atmpin == pin)) {
			System.out.println("sucessful validation");

			while (true) {
				System.out.println("1.view balance");
				System.out.println("2.withdraw balance");
				System.out.println("3.depsite balance");
				System.out.println("4.view minibalance");
				System.out.println("5.Exit");
				System.out.println("enter your choice");
				int ch = sc.nextInt();
				if (ch == 1) {
					a.viewbalance();

				} else if (ch == 2) {
					System.out.println("enter amount to be withdraw ");
					double amt = sc.nextDouble();
					a.withdraw(amt);

				} else if (ch == 3) {

					System.out.println("enter amount to be deposited ");
					double amt = sc.nextDouble();
					a.deposite(amt);

				} else if (ch == 4) {
					a.viewMinistatement();

				} else if (ch == 5) {
					System.out.println("collect your atm card and thankyou for your intrest");
					System.exit(0);
				} else {
					System.out.println("Invalid choice");
					System.exit(0);

				}
			}

		} else {
			System.out.println("invalid pin or card number");
			System.exit(0);
		}

	}

}
