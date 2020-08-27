package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alalim
		 Sayi pozitif ise 10 dan buyuk mu mu diye kontrol edin,
		 10 dan buyuk ise "Wooow!", kucuk ise "Hmmmm!" yazdirin
		 
		 Sayi 0 veya negatif ise -10 dan kucuk mu diye kontrol edim
		 -10 dan kucuk ise "Felaket!", -10 dan buyuk ise "Ne yapalim" yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		if (s>0) {
			if(s>10) {
				System.out.println("Wooow!");
			}else {
				System.out.println("Hmmmm!");
			}
		}else if(s<=0) {
			if(s<-10) {
				System.out.println("Felaket");
			}else {
				System.out.println("Ne yapalim");
			}
			
		}
		
		scan.close();
		
		
	}

}
