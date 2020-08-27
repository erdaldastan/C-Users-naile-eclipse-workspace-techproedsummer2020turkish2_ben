package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan sayi alin
		 Busayi 10'dan 100'e kadar ise "Ikibasamakli sayi yazdirin
		 Aksi takdirde;  "Iki basmakli degil" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
	
		if(num>=10 && num<=99) {
			System.out.println("Iki basmakli");
		}else {
			System.out.println("Iki basamakli degil");
		}
		scan.close();
	}

}
