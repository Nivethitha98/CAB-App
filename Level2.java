package com.nivethitha;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cabType:3");

		String[] cabType = new String[3];
		cabType[0] = "Micro:Rs 10/km";
		cabType[1] = "Mini:Rs 15/km";
		cabType[2] = "Prime:Rs 20/km";
		for (int i = 0; i < cabType.length; i++) {
			System.out.println("cabType:" + cabType[i]);
		}

	}
}
