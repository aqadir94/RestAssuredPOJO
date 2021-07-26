package com.test;

public class test {
	
	public static test m1() {
		
		System.out.println("1");
		
		return new test();
		
	}
	
public test m2() {
		
		System.out.println("2");
		
		return this;
		
	}
	
	
public test m3() {
	
	System.out.println("3");
	
	return this;
	
}

	public static void main(String[] args) {
		
		

		
	m1().m2().m3();
		
	}

}
