import java.util.Scanner;
class ShopDemo{
	
	static String description[]={"Bread","Milk Powder","Tooth Paste"};
	static int unitPrice[]={160,1060,260};
	static Scanner sc=new Scanner(System.in);
	static  byte[] itemBascketIndex=new byte[3];
	static int[] itemBascketQuantity=new int[3];
	static int bascketIndex=0;
	static void getItems(){
		
		System.out.println("Welcome to the Demo Shop");
		System.out.println("Please select your item by Entering the number");
		char userOption='y';
		
		
		do{
	
	
			for(int i=0 ; i<description.length ; i++){
			System.out.println("Enter "+i+" for "+description[i]);
		}
			int itemIndex=sc.nextInt();
		
			System.out.println("You have choosen "+description[itemIndex]);
			System.out.println("Unit price of "+description[itemIndex]+" is "+unitPrice[itemIndex]);
			System.out.println("Enter y to Continue, Press any character to Exit");
			
			
			int numberOfUnits=sc.nextInt();
			
			itemBascketIndex[bascketIndex]=(byte)itemIndex;
			itemBascketQuantity[bascketIndex]=numberOfUnits;
			bascketIndex++;
			
			Scanner sc1=new Scanner(System.in);
			userOption=sc1.nextLine().charAt(0);
		}
		while(userOption=='y' && bascketIndex<3);
}	
	
	
	static void showBascket(){
		System.out.println("No \t item \t Unit Price\t Quantity \t Price");
		for(int i=0 ; i<bascketIndex ; i++){
			System.out.println(i+1+"\t"+description[itemBascketIndex[i]]+" \t"
			+unitPrice[itemBascketIndex[i]]+"\t"+itemBascketQuantity[i]+"\t"
			+itemBascketQuantity[i]*unitPrice[itemBascketIndex[i]]);
		}
		
	}
	
	public static void main(String arg[]){
		
		getItems();
		showBascket();
	}
}