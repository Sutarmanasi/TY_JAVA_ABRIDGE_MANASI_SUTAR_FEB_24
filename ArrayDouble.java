package com.capgemini.assesments.fourth;

public class ArrayDouble {

	public static void main(String[] args) {

		double[] numbers = { 1.4, 2.56, 3.54, 4.24, 5.2 };
		printArrayData(numbers);

		System.out.println("*****************");

		double[] nums = getArrayData();
		printArrayData(nums);
	}

	static void printArrayData(double[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static double[] getArrayData() {
		double[] values = { 9.34, 8.44, 7.32, 6.66, 5.54 };
		return values;
	}
}
