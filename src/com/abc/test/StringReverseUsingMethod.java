package com.abc.test;

class StringRev {
	public void rev(String str) {
		char[] a = str.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}

	}

}
public class StringReverseUsingMethod {

	public static void main(String[] args) {

		StringRev s1 = new StringRev();
		s1.rev("I love India");
	}

}
