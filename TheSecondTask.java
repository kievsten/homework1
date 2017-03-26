package com.gmail.kievsten;

import java.util.*;

public class TheSecondTask {

	public static void main(String[] args) {
		
		//Input, output initialization
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first side: ");
		double a = sc.nextDouble();
		System.out.println("Input second side: ");
		double b = sc.nextDouble();
		System.out.println("Input third side: ");
		double c = sc.nextDouble();
		
		//Calculation triangle semiperimeter
		
		double p;
		p = (a+b+c)/2;
		System.out.println("Triangle semiperimeter: "+p);
		
		//Heron's formula
		
		double s;
		s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Area of a triangle: "+s);
	}

}
