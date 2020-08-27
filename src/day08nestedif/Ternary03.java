package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin
		 Eger character bir harf ise "Harf" yazdirin.
		 Diger durumlarda ekrana "Harf degil" yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir character giriniz");
		char ch = scan.next().charAt(0);
		
		String result =(ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ? "Harf" : "Harf degil";
		System.out.println(result);
		
		scan.close();
	}

}
