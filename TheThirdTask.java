/* Написать программу которая вычислит и выведет на экран
длину окружности, если ее радиус считывается с клавиатуры.
*/

package com.gmail.kievsten;

import java.util.Scanner;

public class TheThirdTask {

	public static void main(String[] args) {
		
		//Input, output initialization
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius: ");
		double r = sc.nextDouble();

		//Circumference
		
		double s;
		s = 2*math.PI*r;
		System.out.println("Circumference is equal to : "+s);
	}

}
