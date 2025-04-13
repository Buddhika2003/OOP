class One{
	int a=10;    //variable definition
	int b;	     //variable declaration
	
	void printDetails(){ //method
		System.out.println("From class one a = "+a);
		System.out.println("From class one b = "+b);
	}
}
class Two{
	int a,c;
	
	void printDetails(){ //method
		System.out.println("From class two a = "+a);
		System.out.println("From class two c = "+c);
	
	}
}
	
class App{

		public static void main(String[] args){
			One o1=new One();
			Two t1=new Two();
			o1.printDetails();
			o1.b=200;
			o1.printDetails();
			
			t1.printDetails();
			t1.a=23;
			t1.c=40;
			t1.printDetails();
			
			
	}
}
	

