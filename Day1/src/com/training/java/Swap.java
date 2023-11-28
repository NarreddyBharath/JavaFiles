package com.training.java;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        int temp=0;
        temp = num1;
        num1= num2;
        num2 = temp;
       System.out.println("After Swaping the values of numm1 and num2 are");
       System.out.println("value of num1 : "+num1);
       System.out.println("Value of num2 : "+num2);

	}

}
