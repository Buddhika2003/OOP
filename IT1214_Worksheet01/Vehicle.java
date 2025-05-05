//Q04
class Vehicle{
	String brand;
	int speed;

	Vehicle(String brand,int speed){
		this.brand=brand;
		this.speed=speed;

	}


void display(){
	System.out.println("Vehicle Brand is "+brand);
	System.out.println("Speed of the vehicle is "+speed+"kmph");
	
	}

	

}

class Car extends Vehicle{
	String model;

	public Car(String brand,int speed,String model){
		super(brand,speed);
		this.model=model;
	}
	
	
	void display(){
		super.display();
		System.out.println("Vehicle model is "+model);
	} 

	
}
class VehicleMain{ 

public static void main(String[]args){
	Car car=new Car("Toyota",120,"Corolla");
	/*car.brand="Toyota";
	car.speed=120;
	car.model="Corolla";*/
 
	car.display();
	}
}
