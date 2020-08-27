package day04scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		// Kucuk data type' inin buyuk data type' ýna cast edilmesi
		// Auto Widening (Genisletme) Castig

		byte b1 = 13;
		int i1 = b1;
		System.out.println(b1);//13
		System.out.println(i1);//13
		
		short s1 = 2300;
		float f1 = s1;
		System.out.println(s1);//2300
		System.out.println(f1);//2300.0
		
		// Explicit (Acikca) Narrowing (Daraltma) Casting
		
		short s2 = 120;
		byte b2 = (byte)s2;
		System.out.println(s2);//120
		System.out.println(b2);//120
		
		double d1 = 23.789;
		float f2 = (float)d1;
		System.out.println(d1);//23.789
		System.out.println(f2);//23.789
		
		short s3 = 255;
		byte b3 = (byte)s3;
		System.out.println(s3);//255
		System.out.println(b3);//-1
		
		short s4 = 1200;
		byte b4 = (byte)s4;
		System.out.println(s4);//1200
		System.out.println(b4);//-80
		
		
		
		// Asagýdaki hata kac farkli sekilde duzeltilebilir.
		//   hatalý  ==>      float f3 = 2.34;
		//1) 2.34 den sonra f yazabiliriz ==> float f3 = 2.34f;
		//2) 2.34 un onune float yazabiliriz ==> float f3 = (float)2.34;
		//3) Data type' ini double' a cevirebiliriz ==> double f3 = 2.34; 
		
		
		
		
		
		
		
		
		
		
		
	}

}
