package com.abc.test;

public class MergetwoArray {

	public static void main(String[] args) {

		int arr1[] = { 1, 3, 5, 7, 9 };
		int n1 = arr1.length;
		int arr2[] = { 2, 4, 6, 8 };
		int n2 = arr2.length;

		int arr3[] = new int[n1 + n2];

		int i = 0, j = 0, k = 0, x;

		System.out.print("Array1: ");
		for (x = 0; x < n1; x++)
			System.out.print(" " + arr1[x]);
		System.out.print("  Array2: ");
		for (x = 0; x < n2; x++)
			System.out.print(" " + arr2[x]);

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
			}
		while (i < n1)
			arr3[k++] = arr1[i++];
		while (j < n2)
			arr2[k++] = arr2[j++];
		System.out.println();
		System.out.println("After merging: ");
		for (x = 0; x < n1 + n2; x++)
			System.out.print(arr3[x] + " ");
	}
}
