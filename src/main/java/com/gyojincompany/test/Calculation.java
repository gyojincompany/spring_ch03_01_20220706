package com.gyojincompany.test;

public class Calculation {
	
	private int num1;
	private int num2;
	
	public void add() {
		int result = num1 + num2;
		System.out.println("두수의 합 : " + result);
	}
	
	public void sub() {
		int result = num1 - num2;
		System.out.println("두수의 차 : " + result);
	}
	
	public void mul() {
		int result = num1 * num2;
		System.out.println("두수의 곱 : " + result);
	}
	
	public void div() {
		int result = num1 / num2;
		System.out.println("두수 나누기 : " + result);
	}
	
	
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
	
}
