package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 Eger uc kenar uzunlugu birbirine eþit ise ekrana "Eskenar ucgen" yazdirin.
		 Diger durumlarda ekrana "Eskenar degil" yazdirin.
		 Ternary ile cozun
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		int k1= scan.nextInt();
		int k2= scan.nextInt();
		int k3= scan.nextInt();
		
		String result = k1>0 && k2>0 && k3>0 && k1==k2 && k2==k3 ? "Eskenar ucgen" : "Eskenar degil";
		System.out.println(result);
		
		
		scan.close();
	
	}

}
