package day08nestedif;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan alacagi urun miktarini ve urunun birim fiyatini alin.
		 Eger urun miktari 1000 den fazla ise
		 Kullaniciya %10 indirim yapin ve odemesi gereken toplam parayi ekrana yazdirin.
		 Diger durumlarda odemesi gereken toplam parayi herhangi bir indirim yapmadan ekrana yazdirin.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Urun adedi giriniz");
		int adet = scan.nextInt();
		System.out.println("Urunun birim fiyatini giriniz");
		int fiyat = scan.nextInt();
		
		if(adet>1000) {
			System.out.println("Indirimli odeme:" + fiyat*0.90*adet);
		}else {
			System.out.println("Indirimsiz Odeme:" + fiyat*adet);
		}
		
		scan.close();
	}

}
