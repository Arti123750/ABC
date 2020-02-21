package com.abc.test;

class StarPattern {
	public void star() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}
}

public class StarPatternUsingMehtod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPattern s1 = new StarPattern();
		s1.star();

	}

}
