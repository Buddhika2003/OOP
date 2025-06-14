import java.util.ArrayList;
import java.util.Scanner;
public class StudentListManager{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		ArrayList<String>students=new ArrayList<>();
		
		
		//Accept 5 student names
		System.out.println("Enter 5 student names");
		for(int i=0 ; i<5 ; i++){
			String name=sc.nextLine();
			students.add(name);
		}
		
		//Display all Student names
		System.out.println("Student List:");
		System.out.println(students);
		
		//search for a name
		
		System.out.println("Enter a name to Search: ");
		String searchname=sc.nextLine();
		
		if(students.contains(searchname))
		{
			int index=students.indexOf(searchname);
			System.out.println(searchname+ " found at index "+ index);
		}
		else{
			System.out.println("Student not found");
		}
		
		//Remove a name 
		System.out.println("\nEnter a name to Remove: ");
		String removename=sc.nextLine();

		if(students.remove(removename))
		{
			System.out.println("Updated Student list");
			System.out.println(students);
		}
		else{
			System.out.println("Student not found");
		}
		
}
}