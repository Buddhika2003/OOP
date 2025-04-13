//this is our first java programme

import java.io.*; //this is how we import packages

class Args{ //class name should start with capital letter

	public static void main(String[] args){
		System.out.println("The first argument is "+args[0]);
		System.out.println("This second argument is "+args[1]);
		System.out.println("This third argument is "+args[2]);
		System.out.println(args[2]+" "+args[1]+" "+args[0]);
		
	}
}