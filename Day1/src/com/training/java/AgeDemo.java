package com.training.java;
import java.util.Scanner;
public class AgeDemo {

	public static void main(String[] args) {
		int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age");
        age = scan.nextInt();
        if(age>18 && age<60)
        {
           System.out.println("Valid age");
        }
        else
        {
            System.out.println("Invalid age");
        }

	}

}
