import java.util.*;
class Product{
	private String name;
	private int unitPrice;
	
	Product(String name,int price){
		this.name=name;
		this.unitPrice=price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getUnitPrice(){
		return unitPrice;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setUnitPrice(int newPrice){
		this.unitPrice=newPrice;
	}
	
	public void printProductDetail(){
		
	}
	
	
}

class BillEntry{
	Product p;
	int quantity;
	
	BillEntry(Product p,int qty){
		this.p=p;
		this.quantity=qty;
		
	}
	void printBillEntry(){
		System.out.println("Product Name: "+p.getName()+" Unit Price: "+p.getUnitPrice()+"No of Units: "+quantity+" Total Price: "+p.getUnitPrice()*quantity);
	}

}

class Bill{
	ArrayList<BillEntry>billEntries=new ArrayList<>();
	void addEntry(BillEntry be){
		billEntries.add(be);
	}
	
	void printBill(){
		for(BillEntry e:billEntries){
		System.out.println("Product name: "+e.p.getName()/*+ " Unit Price:"+e.p.unitPrice()*/);
		}
	}

}

class BillDemo{
	
	static void print(String s){
		System.out.println(s);
	}
	
	static void printProductDetail(Product p){
		print("Name:"+p.getName()+"  Unit Price:"+p.getUnitPrice());
	}
	
	public static void main(String args[]){
		print("Welcome to Demo Shop");
		print("Entering Products");
		Product milk=new Product("Diamond",140);
		print("Successfully added");
		printProductDetail(milk);
		
		Product bread=new Product("Prima",160);
		print("Successfully added");
		bread.setUnitPrice(165);
		printProductDetail(bread);
		
		Bill b=new Bill();
		BillEntry be1=new BillEntry(milk,10);
		
		//adding entries
		b.addEntry(be1);
		b.addEntry(new BillEntry(bread,5));
		b.addEntry(new BillEntry(new Product("Sugar",250),3));
		print("Printing Bill");
		b.printBill();
		
	}
}