package com.abc.test;

import java.util.Scanner;

class Fact {
	public void cal_Fact() {

		int no, fact = 1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no: ");
		no = sc.nextInt();
		for (i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial no: " + fact);
	}

}

public class FactorialUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fact f1 = new Fact();
		f1.cal_Fact();

	}

}
