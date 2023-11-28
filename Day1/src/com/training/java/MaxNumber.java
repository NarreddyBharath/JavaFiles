package com.training.java;
import java.util.Scanner;
public class MaxNumber {

	public static void main(String[] args) {
		int number1;
        int number2;
        int number3;
        int max=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number1");
        number1 = scan.nextInt();
        System.out.println("enter number2");
        number2 = scan.nextInt();
        System.out.println("enter number3");
        number3 = scan.nextInt();
          
       if(number1>number2 && number1>number3)
       {
           max=number1;
        }
       else if(number2>number1 && number2>number3)
       {
         max = number2;
        }
       else
       {
          max=number3;
       }
       System.out.println("The Maximum number among three number is : "+max);

	}

}
