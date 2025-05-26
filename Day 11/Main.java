import java.util.*;
class Main{
	public static void main(String []args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0 ; i<10 ; i++){
			System.out.println("Enter the Integer : "+(i+1));
			
			try{
			sum+=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		i=i-1;
		}
		}
		System.out.println("The sum of 10 integers : "+sum);
		
	}
}
	
