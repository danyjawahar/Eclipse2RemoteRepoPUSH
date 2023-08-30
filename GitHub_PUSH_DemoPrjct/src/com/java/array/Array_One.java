package com.java.array;

public class Array_One {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 25;
		a[1] = 10;
		a[2] = 5;
		a[3] = 30;
		a[4] = 20;
	//Calling method - I
		System.out.println("Print Statement...");
		System.out.println(a[3]);
		System.out.println();
	//Calling method - II	
		System.out.println("For Loop...");
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
	//Calling method - III
		System.out.println();
		System.out.println("For Each...");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("Array Length..." +a.length);
		System.out.println("Index value..." +(a.length-1));

	}
}
