package Odevler;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ders1 , ders2 , ders3 , ders4 , ders5 , ders6;
		
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("Ders 1 Notu = ");
		ders1 = degerAl.nextInt();
		
		System.out.print("Ders 2  Notu = ");
		ders2 = degerAl.nextInt();
		
		System.out.print("Ders 3 Notu = ");
		ders3 = degerAl.nextInt();
		
		System.out.print("Ders 4 Notu = ");
		ders4 = degerAl.nextInt();
		
		System.out.print("Ders 5 Notu = ");
		ders5 = degerAl.nextInt();
		
		System.out.print("Ders 6 Notu = ");
		ders6 = degerAl.nextInt();
		
		double ortalama = (ders1 + ders2 + ders3 + ders4 + ders5 + ders6) / 6;
		
		System.out.println("Ortalama = " + ortalama);
		
		if(ortalama > 60)
			System.out.println("Sinifi Gecti");
		else {
			System.out.println("Sinifta Kaldi");
			
		}
		
	}

}
