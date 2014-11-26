package com.tompok.javaant;

public class Multiplication {
	private int x;
	private int y;
	
	public Multiplication(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int result() {
		return x * y;
	}
	
	public static void main(String[] args) {
		System.out.println("Multiplication:");
		Multiplication multi = new Multiplication(3, 2);
		System.out.println("3 * 2 = " + multi.result());
	}

}
