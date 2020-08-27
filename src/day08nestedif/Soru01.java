package day08nestedif;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir yil alin
		 Eger yýl 1000'e bolunuyorsa ekrana "Milenyum" yazdirin.
		 Eger yýl 100'e bolunuyorsa ekrana "Yuzyil" yazdirin.
		 Eger yýl 10'a bolunuyorsa ekrana "Onyýl" yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil = scan.nextInt();
	
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("Yuzyil");
		}else if(yil%10==0) {
			System.out.println("Onyýl");
		}else {
			System.out.println("Hicbiri");
		}
		
		scan.close();
	}
}
