interface Calculator{
	int add(int a,int b);
	int substract(int a,int b);
	int multiply(int a,int b);
	float divide(int a,int b);
	//void method1(String a);
	//void method2();
	//void method3(int a);
}

class MyCalculator implements Calculator{
	public void method1(String s){
		System.out.println("From C: "+s);
	}

	public int add(int a,int b){
		System.out.println("MyCalculator performed addition operation:"+a+"+"+b+"="+(a+b));
		return a+b;
	}
	
	public int substract(int a,int b){
		System.out.println("MyCalculator performed Substraction operation:"+a+"-"+b+"="+(a-b));
		return a-b;
	}
	
	public int multiply(int a,int b){
		System.out.println("MyCalculator performed Multiplication operation:"+a+"*"+b+"="+(a*b));
		return a*b;
	}
	
	public float divide(int a,int b){
		System.out.println("MyCalculator performed Division operation:"+a+"/"+b+"="+(a/b));
		return a/b;
	}
}

class BuddhikaCalculator{
	void print(){
		System.out.println("Hi from Buddhika");
	}
	public int add(int a,int b){
		System.out.println("BuddhikaCalculator performed addition operation:"+a+"+"+b+"="+(a+b));
		return a+b;
	}
}

public class InterfaceDemo{
	public static void main(String[]args){
		MyCalculator mc=new MyCalculator();
		BuddhikaCalculator bc=new BuddhikaCalculator();
		
		mc.add(5,6);
		mc.divide(8,3);
		mc.substract(23,7);
		mc.multiply(10,4);
		bc.add(2,5);
		
	}
} 