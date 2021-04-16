package com.nivethitha;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mobile number:");
		// Mobile number from User
		String mobileNo = input.next();
		System.out.println("Enter password:");
		// Password from User
		String password = input.next();
		// Checking Password and Mobilenumber
		if (mobileNo.length() == 10 && password.length() == 8) {
			System.out.println("succeeded");
		}
		if (mobileNo.length() > 10 && mobileNo.length() < 10 || password.length() > 8 || password.length() < 8) {
			System.out.println("Check Your mobileNumber or Password");
		}
	}
}
