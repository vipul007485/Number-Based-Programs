package com.jspider.programmingLogic;

import java.util.Scanner;

public class DigitCount {
	
	public int count(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		DigitCount dc = new DigitCount();
		System.out.println(dc.count(n));
		
	}

}
