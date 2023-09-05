package com.jspider.programmingLogic;

public class Discrium {
	public static boolean isDiscrium(int n) {
		int sum = 0; int z = n;
		int count=0;
		while(z>0) {
			count++;
			z = z/10;
		}
		z=n;
		while(z>0) {
			int lastdigit = z%10;
			int pro = 1;
			for(int i=1; i<=count; i++) {
				pro = pro*lastdigit;
			}
			count--;
			sum = sum+pro;
			z=z/10;
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isDiscrium(135));
	}

}
