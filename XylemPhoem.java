package com.jspider.programmingLogic;

public class XylemPhoem {
	public static String isXylemPhoem(int n){
	int sum1 = 0; int sum2 = 0; int temp = n;
	int count1 = 0; int count2 = 0;
	while(n>0) {
		count1++;
		n = n/10;
	}
	while(temp>0) {
		int lastdigit = temp%10;
		count2++;
		if(count2 == 1 || count2 == count1) {
			sum1=sum1+lastdigit;
		}else {
			sum2=sum2+lastdigit;
		}
		temp = temp/10;
	}
	if(sum1 == sum2) {
		return "it is a Xylem number";
	}else {
		return "it is a Phoem number";
	}
}	
	public static void main(String[] args) {
		System.out.println(isXylemPhoem(13338));	
	}
}
