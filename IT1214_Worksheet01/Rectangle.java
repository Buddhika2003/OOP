//Q02
class Rectangle{
	private int length;
	private int breadth;

	Rectangle(){

	}

	Rectangle(int length,int breadth){
			this.length=length;			//missing parts
			this.breadth=breadth;		//missing parts
	}

	public int area(){
			return length*breadth;		//missing parts
	}

}


class RectangleMain{
	public static void main(String[]args){
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle(5,10);
		System.out.println("Area of rect2: " + rect2.area());
	}
}