//Q01
class Student{
	String name;
	String regNo;  //different 
	String course;

	Student(String name,String regNo,String course){
			this.name=name;			//missing parts
			this.regNo=regNo;		//missing parts
			this.course=course;     //missing parts
	}


	public String getName(){
		return name;
	}

	public String getRegNO(){
		return regNo;
	}//missing parts

	public String getCourse(){
		return course;
	}//missing parts

	public void setName(String name){
		this.name=name;
	}
	public void setRegNo(String regNo){
		this.regNo=regNo;
	}//missing parts
	public void setCourse(String course){
		this.course=course;
	}//missing parts

	public void display(){
		System.out.println("Student name : "+name);
		System.out.println("Student Reg No : "+regNo);
		System.out.println("Student Course : "+course);
	}
}

class StudentMain{
	public static void main(String[]args){
		Student student=new Student("John Doe","2025/ICT/101","Information Technology");
		student.display();
	}
}