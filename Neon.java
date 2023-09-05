package com.jspider.programmingLogic;

import java.util.Scanner;

public class Neon {
	public static boolean isEnon(int n){
		int sum=0;
		int sq = n*n;
		while(sq>0) {
			int lastdigit= sq%10;
			sum = sum+lastdigit;
			sq=sq/10;
		}
		if(n==sum) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr a number:- ");
		int n = sc.nextInt();
		System.out.println(isEnon(n));
		
	}

}
