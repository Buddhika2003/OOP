import java.util.Scanner;
class GPA{
	
	float gradePoint(String grade){
		float gp=0.0f;
		/*if(grade.equals("A+") || grade.equals("A")){
			gp=4;
		}
		else if{
			(grade.equals("A-")){
				gp=3.7;
			}
			*/
			Switch(grade){
				case"A+": gpa=4;break;
				case"A": gpa=4;break;
				case"A-": gpa=4;break;
				case"B+": gpa=3.7;break;
				case"B": gpa=3.3;break;
				case"B-": gpa=3;break;
				case"C+": gpa=2.7;break;
				case"C": gpa=2.3;break;
				case"C-": gpa=2;break;
				case"D+": gpa=1.7;break;
				case"D": gpa=1.3;break;
				case"D-": gpa=1;break;
			}
		}
		return gp;
	
	}
}

class Demo{
	public static void main(String[]arg){
		String name;
		String grade;
		float ogpa;
		float point;
		
		Scanner sc=new Scanner(System.in);
		GPA g=new GPA();
		System.out.print("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Hello "+name+"!");
		
		System.out.print("Enter the grade for IT1113: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		System.out.println("Grade point value of the grade "+grade+" is "+point);
		
	}
	
}