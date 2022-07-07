package com.gyojincompany.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator myCal = new MyCalculator();
		
		myCal.setNum1(20);
		myCal.setNum2(10);		
		
		myCal.setCal(new Calculator());
		
		myCal.add();
		myCal.sub();
		myCal.mul();
		myCal.div();	
		
		
		
	}

}
