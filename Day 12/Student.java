class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	
public Student(String name, int exam1, int exam2, int exam3) {
	this.name=name;
	if(validateMarks(marks1)&&validateMarks(marks2)&&validateMarks(marks3)&&)

}

private boolean isMarks(int marks) {
        return marks >= 0 && marks <= 100;
		
}

	public String getName(){
		return name;
	}
	
	public int getExam1(){
		return exam1;
	}
	
	public int getExam2(){
		return exam2;
	}
	
	public int getExam3(){
		return exam3;
	}

	
}




class Main{
	public static void main(String []args){
		Student st=new Student('John',75,110,90);
	
	}
}