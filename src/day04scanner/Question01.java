 package day04scanner;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan dikdortgenin boyutlarini alin ve sonra dikdortgenin alan ve 
		 cevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		 Not: Alan: Boy x En
		 Not: Çevre: 2x (Boy + En)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin en ve boyunu giriniz");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		
		System.out.println("Alan=" + en*boy);
		System.out.println("Cevre=" + 2*(en + boy));
		
		scan.close();
		
		
	}

}
