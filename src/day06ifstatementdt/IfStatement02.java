package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
	/*
	 Kullaniciden bir gun al�n
	 "Cuma" ise ekrana "Muslumanlar i�in kutsal gun" yazdirin;
	 "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin;
	 "Pazar" ise ekrana "H�ristiyanlar i�in kusal gun" 	yazdiri;
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun giriniz");		
		String gun = scan.next();
		//String'leri karsilastirirken sakin haaa"=="kullanmayin
		//String'leri karsilastirirken kesinlikle equals() kullanin
		//equals() boolean return eder.
		
		if(gun.equals("Cuma")) {
			System.out.println("Muslumanlar i�in kutsal gun");	
		}
		
		if(gun.equals("Cumartesi")) {
			System.out.println("Yahudiler i�in kutsal gun");
		}
		
		if(gun.equals("Pazar")) {
			System.out.println("Hristiyanlar i�in kutsal gun");
		}
		
		scan.close();
		
		}

}
