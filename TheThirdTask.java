package com.gmail.kievsten;

import java.util.Scanner;

public class TheThirdTask {

	public static void main(String[] args) {
		
		//Input, output initialization
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius: ");
		double r = sc.nextDouble();
		double pi = 3.1415;

		//Circumference
		
		double s;
		s = 2*pi*r;
		System.out.println("Circumference is equal to : "+s);
	}

}
