package com.java.array;

public class Array_Three {
public static void main(String[] args) {
	int a[][] = {{10,20},{50,100}};
	
	for (int i = 0; i <2; i++) {
		System.out.println("Value for i = " +i);
		for (int j = 0; j <2; j++) {
			System.out.println("Value for j = " +j);
			System.out.println(a[i][j]);
		}
	}
}
}
