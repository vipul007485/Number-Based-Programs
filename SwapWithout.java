package com.jspider.programmingLogic;

import java.util.Scanner;

public class SwapWithout {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int n1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 2nd number ");
		int n2 = sc2.nextInt();
		
		n1 = n1+n2;
		n2 = n1-n2;
		n1=n1-n2;
		
		System.out.println("n1:- "+ n1);
		System.out.println("n2:- "+ n2);			
	}

}
