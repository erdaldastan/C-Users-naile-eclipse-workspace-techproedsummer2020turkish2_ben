package day05incrementdecrement;

public class Increment {

	public static void main(String[] args) {
		// Increase = Artirmak Increment = Artis
		
		// Increment 1. Yol
		int s = 12;
		System.out.println(s);//12
		
		s = s + 3;
		System.out.println(s);//15
		
		s = s + 5;
		System.out.println(s);//20
		
		//Increment 2. Yol
		int t = 22;
		System.out.println(t);
		
		t += 3;//Bu ifade t = t + 3;ile aynidir.
		System.out.println(t);//25
		
		//Sadece 1 artiracaksaniz asg�daki yontemi kullanin
		int u = 32;
		System.out.println(u);//32
		
		u++;//Bu ifade u = u + 1 veya u += 1; ile aynidir ama 1 artirmalarda hep bu kullan�l�r
		System.out.println(u);
	}

}
