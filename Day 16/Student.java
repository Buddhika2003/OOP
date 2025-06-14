import java.util.Scanner;
class Student{
	String  name;
	
	Student(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
public class ArrayList{	
	ArrayList<String>students=new ArrayList<>();
		void addName(String st){
		students.add(name);
		
		void display(){
			System.out.println(st.getName);
		}
	}
}

class DisplayInfo{
	System.out.println("Student name: "+name);
}

class Main{
	public static void main(String[]args){
		for(int i=0 ; i<5 ; i++){
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter Student name:");
		
		String name=sc.nextLine();
		st.DisplayInfo();
		}
	}
}
 