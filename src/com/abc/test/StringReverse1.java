package com.abc.test;

public class StringReverse1 {

	public static void main(String[] args) {
		String str1 = "Hello world";
		char[] a = str1.toCharArray();

		for (int i = a.length - 1; i > 0; i--) {
			System.out.print(a[i]);
		}
	}
}
