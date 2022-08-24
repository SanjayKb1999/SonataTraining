package com.sonata.Calculator;
public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
public int mul(int a, int b) {
	return a*b;
} 
public int div(int a, int b) {
	return a/b;
} 
	public static void main(String[] args) {
		Calculator c = new Calculator();
	    System.out.println(c.add(10,20));
	    System.out.println(c.mul(10,20));
		

	}

}
