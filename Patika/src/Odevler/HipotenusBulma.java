package Odevler;

import java.util.Scanner;
import java.lang.Math;

public class HipotenusBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a , b;
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("a Degeri = ");
		a = degerAl.nextInt();
				
		System.out.print("b Degeri = ");
		b = degerAl.nextInt();
		
		double hipotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Hipotenus Uzunlugu = " + hipotenus);
		

	}

}
