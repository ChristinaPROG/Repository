package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * *I need to define wheather number that is entered from user
		 * small number is a number between 1 to 10
		 * medium number is a number between 11 to 100
		 * large number is a number between 101 to 1000
		 */

		Scanner input;
          int number;

           input=new Scanner(System.in);
System.out.println("Please enter any number");
number=input.nextInt();

if (number>0 && number<=10) {
	System.out.println("You entered small number");	}

	else if (number>10 && number<=100) {
		System.out.println("You entered medium number");
	}else if (number>100 && number <=1000) {
		System.out.println("You entered large number");
	}

}
}