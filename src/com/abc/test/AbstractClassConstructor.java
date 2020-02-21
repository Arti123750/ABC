package com.abc.test;

abstract class ABC {

	ABC() {
		System.out.println("Abstract class Constructor");
	}

}

class ABCD extends ABC {
	public void m1() {
		System.out.println("In method m1");
	}
}

public class AbstractClassConstructor {

	public static void main(String[] args) {
		ABCD a1 = new ABCD();
		a1.m1();

	}

}
