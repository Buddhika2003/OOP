//Q03
class Calculator{
	int add(int x,int y){
		return x + y;     //two integers
	}

	int add(int x, int y, int z){
		return x + y + z;   //three integer
	}

	double add(double x,double y){
		return x + y;     //two double
	}


}
class CalMain{
	public static void  main(String[]args){
		Calculator calc=new Calculator();
		System.out.println("Add two integers: " + calc.add(2, 3));
		System.out.println("Add three integers: " + calc.add(2, 3, 4));
		System.out.println("Add two doubles: " + calc.add(2.5, 3.5));
	} 
}