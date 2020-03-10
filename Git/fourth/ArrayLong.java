package com.capgemini.assesments.fourth;

public class ArrayLong {

	public static void main(String[] args) {

		long[] numbers = { 187l, 256l, 354l, 4424l, 52l };
		printArrayData(numbers);

		System.out.println("*****************");

		long[] nums = getArrayData();
		printArrayData(nums);
	}

	static void printArrayData(long[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static long[] getArrayData() {
		long[] values = { 9534l, 844l, 7432l, 6466l, 5554l };
		return values;
	}
}
