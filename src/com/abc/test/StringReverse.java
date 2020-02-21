package com.abc.test;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="IloveIndia";
		
		char[]a=s1.toCharArray();
		
		for(int i=a.length-1;i>0;i--)
		{
			System.out.print(a[i]);
		}

	}

}
