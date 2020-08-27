package day03variables;

public class String01 {

	public static void main(String[] args) {
		
		String isim = "Suleyman";
		System.out.println(isim);
		
		String soyİsim = "Can";
		
		System.out.println(isim + soyİsim);
		System.out.println(isim + " " + soyİsim);

		//int data type ine char atamasi yaparsaniz Java o char ın sayi degerini alır
		int ilkKucukHarf = 'a';
		System.out.println(ilkKucukHarf);//97
		
		int koseliParantez = '[';
		System.out.println(koseliParantez);//91
		
		//Iki tane char arasina herhangibir matematiksel koyarsaniz Java
		//o char larin ASCII degerleri üzerinden islem yapar
		System.out.println('a' + 'b');//Ekrana 978+98 yani 195 yazar
		
		//Illa ki char larin yanyana yapistirmak isterseniz en basa bos String koyun
		System.out.println("" + 'a' + 'b');//ab	
		
		
	}

}
