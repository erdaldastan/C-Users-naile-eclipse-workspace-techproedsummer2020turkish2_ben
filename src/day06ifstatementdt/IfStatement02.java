package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	/*
	 Kullaniciden bir gun alýn
	 "Cuma" ise ekrana "Muslumanlar için kutsal gun" yazdirin;
	 "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin;
	 "Pazar" ise ekrana "Hýristiyanlar için kusal gun" 	yazdiri;
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun giriniz");		
		String gun = scan.next();
		//String'leri karsilastirirken sakin haaa"=="kullanmayin
		//String'leri karsilastirirken kesinlikle equals() kullanin
		//equals() boolean return eder.
		
		if(gun.equals("Cuma")) {
			System.out.println("Muslumanlar için kutsal gun");	
		}
		
		if(gun.equals("Cumartesi")) {
			System.out.println("Yahudiler için kutsal gun");
		}
		
		if(gun.equals("Pazar")) {
			System.out.println("Hristiyanlar için kutsal gun");
		}
		
		scan.close();
		
		}

}
