package com.abc.test;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class UsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = new ArrayList<>();

		l1.add("I love India");

		Object[] a = l1.toArray();
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
