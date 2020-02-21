package com.abc.test1;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int no,rev=0;
		
		System.out.println("Enter a no");
		no=sc.nextInt();
		
		while(no!=0)
		{
			rev=rev*10 + no%10;
			no=no/10;
		}
		System.out.println(rev);
	}
	

}
