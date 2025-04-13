class Car{
	private String model;
	//getter
	public String getModel(){
		return model;
		}
		
		//setter
	public void setModel(String newModel){
		this.model=newModel;
		}

	
	Car(){
			model="Mazda S3";
	}
	
	Car(String m){
			model=m;
	}
}
		
	public class CarMain{
		public static void main (String[] args){
		Car c1=new Car();
		c1.setModel("Toyota Corolla");
		
		System.out.println(c1.getModel());
		
		}
	}