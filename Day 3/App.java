import a.*;
import b.*;

class App{
	public static void main(String[] args){
		a.Test t1=new a.Test();
		b.Test t2=new b.Test();
		t1.display();
		t2.print();
		
	}
}


//Expected output 
/*
Hi from class test in package a
Hi from class test in package b


*/
