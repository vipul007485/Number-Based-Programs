package com.jspider.programmingLogic;
public class Calculator {
//	static method void type
	public static void addTwoNumber(int a, int b) {
		int res = a+b;
		System.out.println(res+"is sum of two number");
	}
//non-static method-void type
	public void subTwoNumber(int a, int b) {
		int res = a-b;
		System.out.println(res+"is pro of two number");
	}
//static int return type
	
	public static int proTwoNumber(int a, int b) {
		int pro = a*b;
		return pro;
	}
	
//non-static double 
	public double divideTwoNumber(int a, int b) {
		return a/b;
	}
	
//	public static void main(String[] args) {
//		//addTwoNumber(10, 20);
//		int pro =proTwoNumber(10, 10);
//		System.out.println(pro);
//		
//	}



}
