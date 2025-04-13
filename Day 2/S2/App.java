import IT.*;
import hons.*;
import AMC.*;

class App{
	public static void main (String[] ar){
		AMC.FirstYear fya=new AMC.FirstYear();
		IT.FirstYear fyi=new IT.FirstYear();
		SecondYear sy=new SecondYear();
		FourthYear itHons=new FourthYear();
		
		fya.display();
		fyi.display();
		sy.display();
		itHons.display();
		}
	}