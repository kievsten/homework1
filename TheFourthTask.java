/*Разобраться с 16-й системой исчисления. Узнать какое
число зашифровано в названии группы ACDC
*/

package com.gmail.kievsten;
import java.util.*;
public class TheFourthTask {

	public static void main(String[] args) {
		
		int a = 10;
		int c = 12;
		int d = 13;
		
		int acdc;
		
		ACDC = (int) (c*(Math.pow(16, 0))+(d*(Math.pow(16, 1)))+(c*(Math.pow(16, 2)))+(a*(Math.pow(16, 3))));
		System.out.println("Encrypted number is: "+ACDC);
		//Encrypted number is: 44252
	}

}
