import java.util.*;

class InputDemo{
	public static void main(String[]args){
		String name;
		int age;
		byte marks;
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Hi Enter Your Name : ");
		name=sc.nextLine();
		System.out.println("Hello "+name+", How are you?");
		System.out.println("Hi Enter Your age: ");
		age=sc.nextInt();
		System.out.println("Ohh god! Are you "+age+" years old?");
		System.out.println("Enter Your marks: ");
		marks=sc.nextbyte();
		System.out.println("You got "+marks+" marks.");
	}
}
