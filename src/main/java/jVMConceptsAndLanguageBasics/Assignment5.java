package jVMConceptsAndLanguageBasics;

import java.util.Scanner;

public class Assignment5 {
	/**
	 * Write a program that will accept a 4 digit number(assume that the user enters
	 * only 4 digit nos.) and print the sum of all the 4 digits. For ex : If the
	 * number passed is 3629, the program should print “The sum of all the digits
	 * entered is 20”
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 4 digin Number: ");
		int number = scanner.nextInt();
		int sum = 0;
		while(number > 0) {
			sum = sum+number%10;
			number = number/10;
		}
		scanner.close();
		System.out.println(sum);
	}
	
}
