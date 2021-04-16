package com.nivethitha;

import java.util.Scanner;

public class Level4 {
	public static float calc(float totalAmount) {

		float gstAmount = totalAmount * 7 / 100;

		return gstAmount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bill Amount:");
		float totalAmount = sc.nextInt();
        //Converted into float to int
		int gstAmount = (int) calc(totalAmount);
		System.out.println("GstAmount:" + gstAmount);

	}

}
