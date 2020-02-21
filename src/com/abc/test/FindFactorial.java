package com.abc.test;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		
		int no,fact=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		no=sc.nextInt();{
		for(int i=1;i<=no;i++)
		fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
}
