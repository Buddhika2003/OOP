class Student{
	String name="Adam";
	int marks=100;
	
	Student(){
		name="NoName";
	}
	
	Student (String n){
		name=n;
	}
	
	Student(String n,int m){
		name=n;
		marks=m;
	}
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from studentdemo class");
		System.out.println("creating an object of student class");
		Student s1=new Student("nick name",76);
		System.out.println("creating an object of student class");
		
		System.out.println("name value of the object is"+s1.name);
		System.out.println("mark value of the object is"+s1.marks);
	
		s1.name="Buddhika";
		s1.marks=84;
		
		System.out.println("name value of the object is"+s1.name);
		System.out.println("mark value of the object is"+s1.marks);
		
		}
	}