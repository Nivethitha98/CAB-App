package com.nivethitha;

import java.util.Scanner;

public class Level3 {
//Calculating fare for micro
	public static float micro(float distance) {
		int pricePerKm = 10;
		float fare1 = pricePerKm * distance;
		return fare1;

	}

//Calculating fare for mini
	public static float mini(float distance) {
		int priceperkm = 15;
		float fare2 = priceperkm * distance;
		return fare2;
	}

//Calculating fare for prime
	public static float prime(float distance) {
		int priceperkm = 15;
		float fare2 = priceperkm * distance;
		return fare2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance:");
		float distance = sc.nextInt();
		float totalFare1 = micro((float) distance);
		System.out.println("Your Total Bill Amount Rs:" + totalFare1);

	}

}
