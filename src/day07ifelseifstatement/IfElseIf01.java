package day07ifelseifstatement;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan sayi alin
		 Sayi sifirdan buyuk ise ekrana "Pozitif" yazdirin
		 Sayi sifir ise ekrana "Notr" yazdirin
		 Sayi sifirdan kucuk ise ekrana "Pozitif" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");//kullanicinin verecegi sayi
		double s = scan.nextDouble();//kullanicinin verecegi sayi icin olusturulan variable
		
		if(s>0) {
			System.out.println("Pozitif");
		}else if(s==0) {
			System.out.println("Notr");
		}else if(s<0) {
			System.out.println("Negatif");//ikiden fazla çoklu þartlarda else if yerine sadece else kullanýlabilir.
			}
			
		scan.close();
		
		}
	
	}