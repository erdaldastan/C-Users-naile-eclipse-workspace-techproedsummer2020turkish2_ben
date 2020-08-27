package day14methodcreation;

public class Mc01 {

	public static void main(String[] args) {
		toplama(3, 5);
		cýkarma(5, 1);
		carpma(3, 4);
		carpma(3);
		String str = "Ali";
		
				
	}

	
	public static void toplama(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public static void cýkarma(int n1, int n2) {
		System.out.print("Sonuc");
		System.out.println(n1 - n2);
		
	}
	
	public static void carpma(int n1, int n2) {
		System.out.print("Sonuc");
		System.out.println(n1*n2);
	}
	
	public static void carpma(int n1) {
		System.out.println("Altýncý carpma methodu");
		
	}
	
	public static void carpma(long n1) {
		System.out.println("Ucuncu carpma methodu");
	}
	
	public static void carpma(int n1, double n2) {
		System.out.println("Dorduncu carpma methodu");
		
	}
	
	public static void carpma(double n1, int n2) {
		System.out.println("Besinci carpma methodu");
		
	}
	
	
		
	
}

