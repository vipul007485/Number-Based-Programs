package com.jspider.programmingLogic;
import java.util.Scanner;

public class Palindrome {
		public static boolean isPalindrome(int n) {
			int rev = 0; int temp = n;
			while(n>0) {
				int last = n%10;
				rev = rev * 10 + last;
				n = n/10;
			}
			if(rev == temp) {
				return true;
			}else {
				return false;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:- ");
			int n = sc.nextInt();
			System.out.println(isPalindrome(n));
		}

	}


