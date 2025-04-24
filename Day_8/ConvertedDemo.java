/*Type conversion and type casting


boolean
short
char 
long
int
float
double
string*/

class ConvertedDemo{
	public static void main(String[]args){
		boolean bo=true;
		byte by=112;
		short sh=15;
		char ch='a';
		long lo=45221454;
		int in=456;
		float fl=112.2545f;
		double db=78.25486;
		String st="Hi";
		
		lo=by;
		sh=(short)lo;
		fl=in;
		in=(int)db;
		in=ch;
		
		System.out.println("Value of boolean bo is : "+bo);
		System.out.println("Value of byte by is : "+by);
		System.out.println("Value of short sh is : "+sh);
		System.out.println("Value of char ch is : "+ch);
		System.out.println("Value of long lo is : "+lo);
		System.out.println("Value of int in is : "+in);
		System.out.println("Value of float fl is : "+fl);
		System.out.println("Value of double db is : "+db);
		System.out.println("Value of String st is : "+st);

}
}