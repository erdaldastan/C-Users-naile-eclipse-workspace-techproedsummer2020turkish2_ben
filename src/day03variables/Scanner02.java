package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//1)Kullanicidan Tam ismini alýn ekrana yaziniz
		//2)Kullanicidan yasini alýn ekrana yaziniz
		//3)Kullanicidan isminin ilk harfini alin ekrana yaziniz
		//4)Kullanicinin cocuk sayisini byte ile alýnýz
		
			Scanner scan = new Scanner(System.in); 
			
			System.out.println("Tam isminizi giriniz");
			String tamIsim = scan.nextLine();
			System.out.println(tamIsim);//Erdal Dastan
			
			System.out.println("Yasinizi giriniz");
			int yas = scan.nextInt();
			System.out.println(yas);//43
			
			System.out.println("Isminizin ilk harfini giriniz");
			char ilkHarf = scan.next().charAt(0);
			System.out.println(ilkHarf);//E
			
			System.out.println("cocuk sayisini girini");
			byte cocukSayisi = scan.nextByte(0);
			System.out.println(cocukSayisi);
			
	}

}

