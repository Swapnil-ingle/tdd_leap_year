package com.github.year.main;

import java.util.Scanner;

import com.github.year.svc.YearValidator;

public class Driver {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("========== Welcome to leap year checker! ==========\n");

		while (true) {
			Long year = getInputYear();

			if (YearValidator.getInstance().isLeapYear(year)) {
				System.out.println(year + " is a leap year!");
			} else {
				System.out.println(year + " is NOT a leap year!");
			}

			System.out.println("Would you like to try again? (yes/no)");

			if (!tryAgain()) {
				break;
			}
		}

		System.out.println("Exiting...");
		sc.close();
	}

	private static Long getInputYear() {
		System.out.println("Please enter the year:");

		try {
			return Long.valueOf(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid number - Try again!");
		}

		return getInputYear();
	}

	private static boolean tryAgain() {
		try {
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				return true;
			}

			if (choice.equalsIgnoreCase("no")) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Exception while getting tryAgain choice: " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Invalid input - Please input 'yes' or 'no':");
		return tryAgain();
	}
}
