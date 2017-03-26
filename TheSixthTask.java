package com.gmail.kievsten;

import java.util.Scanner;

public class TheSixthTask {

	public static void main(String[] args) {
		
		int house = 144;
		int floor;
		int entrance;
		int appartment;
		
		//Input, output initialization
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of appartment: ");
		appartment = sc.nextInt();
		
		if(appartment <= 0 || appartment > 144)
		{
			System.out.println("House have only 144 appartment");
			System.out.println("Please try again");
			appartment = sc.nextInt();
		}
		else if (appartment % 36 == 0)
		{
			entrance = appartment / 36;
			floor = 9;
		}
		
		else if (appartment % 36 % 4 == 0) { // для последней квартиры на этаже

			entrance = appartment / 36 + 1;
			floor = appartment % 36 / 4;

		} else { // для остальных

			entrance = appartment / 36 + 1;
			floor = appartment % 36 / 4 + 1;
			System.out.println("Apartment " + appartment + " Floor " + floor + " Etrance " + entrance);
		}
	}
	

}
