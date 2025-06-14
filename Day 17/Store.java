import java.util.ArrayList;
import java.util.Scanner;

class Store{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Double>prices=new ArrayList<>();
		
		System.out.println("------Enter prices for 7 products-----");
		
		for(int i=1 ; i<=7 ; i++)
		{
			System.out.print("Product "+i+" price: ");
			double price=sc.nextDouble();
			prices.add(price);
		}
		//Display all marks
		System.out.println("Products price List:");
		System.out.println(prices);
	
		//Count and display product costing more than 100
		int count=0;
		for(double price:prices)
		{
			if(price>100)
			{
				count++;
			}
		}
		System.out.println("No. of products costing more than 100: "+count);
		
	
	//increase each price by 10%
	for (int i=0 ; i<prices.size() ; i++)
	{
		double updateprice=prices.get(i)*1.10;
		prices.set(i,updateprice);
	}
	System.out.println("Prices after increase: "+prices);
}
}