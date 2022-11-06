package Odevler;

import java.util.Scanner;
import java.lang.Math;

public class HipotenusBulma {

	public static void main(String[] args) {
		
		int a , b , c;
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("a Degeri = ");
		a = degerAl.nextInt();
				
		System.out.print("b Degeri = ");
		b = degerAl.nextInt();
		
		System.out.print("c Degeri = ");
		c = degerAl.nextInt();
		
		double pi = 3.14 , u = (a + b + c) / 2 , alan , cevre;
		
		cevre = 2 * u;
		alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		
		System.out.println("u = " + u);
		System.out.println("Cevre = " + cevre);
		System.out.println("Alan = " + alan);
		

	}

}
