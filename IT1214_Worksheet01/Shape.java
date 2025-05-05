//Q07
class Shape{
	
	void area(){
		System.out.println("Area not defined.");
	}
	

}

class Circle extends Shape{
	double radius;

	Circle(double radius){
		this.radius=radius;
	}


	void area(){
		double area;
		area=Math.PI*radius*radius;
		System.out.println("The area of the circle with "+radius+" radius is "+area);
	}
}

class ShapeMain{
	public static void main(String[]args){
		Circle s1=new Circle(5.0);
		s1.area();
	}
}