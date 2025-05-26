import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[]args){
		System.out.println("Start of the program");
		int a=10;
		int b=0;
		try{
		int c=a/b;
		int d=Integer.parseInt(args[0]);
		}
		catch(Exception e){
			System.out.println("An error occured!");
			System.out.println("The error is "+e.getMessage());
			
		}
		System.out.println("End of the program");
	}
	
}


class Main{
	public static void main(String[]args){
		ExceptionDemo ed=new ExceptionDemo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integers : ");
		sc.nextInt();
		
		
	}
}
