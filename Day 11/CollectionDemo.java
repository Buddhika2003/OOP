import java.util.*;

class Item{
	String name;
	int price;
	Item(String name,int price){
		this.name=name;
		this.price=price;
	}
}

class CollectionDemo{
		public static void main(String[]args){
			/*int[] a new int[5];
			a[0]=2;
			a[]1=30;
			a[2]44;
			a[3]=32;
			a[4]=21;
			//a[5]=100;*/
			
			
			List<Integer> b= new ArrayList<Integer>();
			b.add(2);
			b.add(30);
			b.add(60);
			System.out.println("Elements of B are"+b);
			
			List<Item> products= new ArrayList<Item>();
			
			products.add(new Item("Milk powder",1060));
			products.add(new Item("Tooth paste",260));
			products.add(new Item("Bread",160));
			
			for(Integer element: b){
				System.out.println(element);
			}
			
			for(Item e : products){
				System.out.println(e.name + " Price : "+e.price);
			}
	
	}
	
	
}