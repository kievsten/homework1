package com.gmail.kievsten;
import java.util.*;

public class TheFifthTask {

	public static void main(String[] args) {
		
		//Input, output initialization
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First number: ");
		int a = sc.nextInt();
		System.out.println("Second number: ");
		int b = sc.nextInt();
		System.out.println("Third number: ");
		int c = sc.nextInt();
		System.out.println("Fourth number: ");
		int d = sc.nextInt();
		int maxNumber = a;
		
		//Conditional operator if, else if
		
		if (maxNumber<b)
		{
			System.out.println("Max number: "+b);
		}
		else if (maxNumber<c)
		{
			System.out.println("Max number: "+c);
		}
		else if (maxNumber<d)
		{
			System.out.println("Max number: "+d);
		}
		else
		{
			System.out.println("Max number: "+a);
		}
	}

}
