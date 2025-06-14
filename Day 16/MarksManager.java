import java.util.Collections;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Scanner;

public class MarksManager{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>marks=new ArrayList<>();
		
		
		//Accept student marks
		
		System.out.println("Enter Marks for 10 students: ");
			for(int i=0 ; i<10 ; i++){
				System.out.println("Enter mark "+(i+1)+ ":");
				int mark=sc.nextInt();
				marks.add(mark);
		}
		
		//Display all marks
		System.out.println("Display all Student marks: ");
		System.out.println(marks);
	

		//Calculate and display average
		int sum=0;
		
		for(int mark: marks){
			sum+=mark;
		}
		System.out.println("Sum: "+sum);
		double avg=sum/marks.size();
		System.out.println("Average: "+avg+"%");
	
	//Display the highest and lowest marks
	int highest = Collections.max(marks);
	int lowest = Collections.min(marks);
	System.out.println("Highest mark: "+highest);
	System.out.println("Lowest mark: "+lowest);
	
	Iterator<Integer>iterator =marks.iterator();
	
	while(iterator.hasNext())
	{
		int mark = iterator.next();
			if(mark<40)
			{
				iterator.remove();
			}
	
		}
	}
}