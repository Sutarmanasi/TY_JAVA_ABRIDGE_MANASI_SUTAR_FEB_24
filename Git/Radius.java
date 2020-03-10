package com.capgemini.assesments.first;

import java.util.Scanner;

public class Radius {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the diameter of circle : ");
		int diameter = scn.nextInt();
		int radius = diameter / 2;
		System.out.println("Radius of circle is " + radius);
	}
}
