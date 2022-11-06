package Odevler;

import java.util.Scanner;

public class KDVTutariHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double kdv = 18;
		
		Scanner degerAl = new Scanner(System.in);
		
		System.out.print("Miktar Giriniz = ");
		double fiyat = degerAl.nextDouble();
		
		if(fiyat >= 1000) { kdv = 8; }
		
		double kdvFiyat = fiyat + (fiyat * (kdv / 100));
		
		double sonuc = kdvFiyat - fiyat;
		
		System.out.println("KDV \'siz Fiyat = " + fiyat);
		System.out.println("KDV \'li Fiyat = " + kdvFiyat);
		System.out.println("KDV Tutari = " + sonuc);
		
	}

}
