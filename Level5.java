package com.nivethitha;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Level5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the cabType:");
	String cabtype=sc.next();
	switch(cabtype) {
	case "Micro":
		System.out.println("Micro:Rs 10/km");
		break;
	case "Mini":
		System.out.println("Mini:Rs 15/km");
		break;
	case "Prime":
		System.out.println("Prime:Rs 20/km");
		break;
	}
	System.out.println("Enter Journey Date:");
	String journey=sc.next();
	//to find localdate
	LocalDate date=LocalDate.now();
	System.out.println("Enter pickup Time:");
	String pickup=sc.next();
	//To find pickupTime
	LocalTime pickupTime=LocalTime.now();
	
	

}
}
	


