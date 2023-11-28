package com.training.java;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scan.nextInt();
        System.out.println("Enter number2");
        int number2 = scan.nextInt();
        int result = number1 * number2;
        System.out.println("product of two numbers is : "+result);

	}

}
