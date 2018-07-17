package jVMConceptsAndLanguageBasics;

import java.util.Scanner;

public class Assignment3 {
	/* Write a Java program to convert minutes into a number of years and days. */
	public static void main (String[] args) {
		double minutesInYears = 60*24*365;
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		
		long years = (long)(input/minutesInYears);
		long days = (long) (input/60/24) % 365;
		scan.close();
		System.out.println((int) input + " minutes is approximately " + years + " years and " + days + " days");
		
		
	}
}
