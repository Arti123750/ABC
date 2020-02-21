package com.abc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Merge {

	public static void main(String[] args) {

		Integer arr1[] = { 1, 3, 5, 7, 9 };
		Integer arr2[] = { 2, 4, 6, 8 };

		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);

		List<Integer> l3 = new ArrayList<Integer>();

		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println(l3);

		Collections.sort(l3);
		System.out.println(l3);

	}

}
