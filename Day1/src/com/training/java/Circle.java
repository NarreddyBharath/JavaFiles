package com.training.java;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius = scan.nextFloat();
        float area = 3.141f * radius * radius;
        System.out.println("area of a Circle is : "+area);

	}

}
