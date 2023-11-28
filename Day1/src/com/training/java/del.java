package com.training.java;

import java.util.Scanner;

public class del {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			String num = scan.next();
			char ar[] = new char[4];
			for(int i=0;i<num.length();i++) {
				if(num.charAt(i)>='0' && num.charAt(i)<='9') {
					ar[i]=num.charAt(i);
				}
				else {
					System.out.println("please enter digits from 0-9");
					System.exit(0);
				}
			}
			if(num.length()==4) {
				System.out.println("Valid");
			}
			else {
				System.out.println("please enter 4 digit pin");
			}
				
		}
		catch(Exception e) {
			System.out.println("Please enter 4 digit number");
		}

	}

}
