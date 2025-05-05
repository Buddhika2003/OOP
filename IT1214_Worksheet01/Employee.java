//Q10
class Employee{
	String name;
	int id;
	double salary;


	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;

	}

	void displayDetails(){
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
		System.out.println("Employee salary : "+salary);
	}
}

class Manager extends Employee{
	double bonus;
		
		Manager(String name,int id,double salary,double bonus){
			super(name,id,salary);
			this.bonus=bonus;

		}
		
		void displayDetails(){
		super.displayDetails();
		System.out.println("Employee bonus : Rs."+bonus);
		System.out.println("Total Salary : Rs."+(bonus+salary));

	}
}

class EmployeeMain{
	public static void main(String[]args){
		Manager manager=new Manager("Bob",201,75000,10000);
		manager.displayDetails();
	}
}