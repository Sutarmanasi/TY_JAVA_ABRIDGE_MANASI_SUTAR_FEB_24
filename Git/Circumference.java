package com.capgemini.assesments.first;

import java.util.Scanner;

public class Circumference {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the radius : ");
		int radius = scn.nextInt();
		double result = 2 * 3.14 * radius;
		System.out.println("Circumference of circle with radius " + radius + " is " + result);
	}

}
