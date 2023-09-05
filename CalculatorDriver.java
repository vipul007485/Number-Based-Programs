package com.jspider.programmingLogic;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator.addTwoNumber(10, 20);
		
		Calculator sub = new Calculator();
		
		sub.subTwoNumber(30, 10);
		
		int pro = Calculator.proTwoNumber(10, 20);
		System.out.println(pro+"is pro of twonumber");
		
		Calculator div = new Calculator();
		System.out.println(div.divideTwoNumber(100, 10)+"is div of two number");
		
		
		
		
		
	}

}
