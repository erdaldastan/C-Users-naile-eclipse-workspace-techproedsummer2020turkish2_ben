package day15constructors;

public class C01 {
	
	/*
	 1)Constructor'lar main method'un disinda, class'in icinde olusturulur
	 2)Constructor'in ismi class ismi ile ayni olmalidir
	 3)Method ismi ile Constructor Farki: a)Method ismi class isminden farkli olabilir
	 										fakat Constructor ismi class ismi ile ayni olmalidir.
	 									  b)Method'larda return type olmak zorundadir ama
	 									    Constructor'larda return type olmaz. Constructor'a return 
	 									    type eklerseniz artik o Constructor degil method'dur
	 4)Bir Class'ta birden fazla constructor olabilir. Ama Constructor'larin parametreleri farkli olmalidir.
	   Yani farkli Constructor uretmek için overloading kurallarini kullanmaliyiz.									    	
	 */
	
	C01(){
		System.out.println("Parametresiz constructor");	
}
	
	C01(int i){
		System.out.println("Integer parametreli constructor");	
}
	
	C01(String s){
		System.out.println("String parametreli constructor");	
}
	C01(String s, int i){
		System.out.println("Iki parametreli constructor");	
}
	
	public static void main(String[] args) {
		//Class ismi   Object ismi verin           new keyword kullanin        Constrctor
              C01 	          obj1            =             new	                   C01();
              C01 	          obj2            =             new	                   C01("Ali");
              C01 	          obj3            =             new	                   C01(11);
              C01 	          obj4            =             new	                   C01("Ali",11);
	}

	void toplama() {
		System.out.println("Toplama");
	}
	
}
