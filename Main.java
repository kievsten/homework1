	/* Написать программу которая считывает 5-и значное число с клавиатуры и выводит цифры из которого оно состоит.
	 Например : Считывается число 54698
	Выводиться:
	5
	4
	6
	9
	8
	*/

	package com.gmail.kievsten;
	import java.util.*;
	public class Main {
	
		public static void main(String[] args) {
			
			//Input Output Method
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Input digit: ");
			int x = sc.nextInt();
			System.out.println("Digit: "+x);
			
			//Creating and initializing variables
			
			int a = x/10000;
			int b = x%10000/1000;
			int c = x%1000/100;
			int d = x%100/10;
			int e = x%10/1;
			
			//Output to the console
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
	
		}
	
	}
