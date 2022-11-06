package Odevler;

import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {
		/*
		Taksimetre Programı
		Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

		Taksimetre KM başına 2.20 TL tutmaktadır.
		Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		Taksimetre açılış ücreti 10 TL'dir.
		*/
		
		float km = 2.2f;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Gidilen km = ");
		float gidilenYol = inp.nextFloat();
		
		float tutar = km * gidilenYol;
		
		if(tutar + 10 < 20) {
			
			tutar = 20;
			
		}
		else {
			
			tutar += 10;
			
		}
		
		System.out.println("Tutar = " + tutar);
		
		
	}

}
