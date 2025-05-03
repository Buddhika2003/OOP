import java.util.Scanner;
class BankAccount{
	private String accountHolder;
	private double balance;
	
	BankAccount(String name){
		this.accountHolder=name;
		this.balance=1000;
	}


 void displayAccountInfo(){
		System.out.println("Account Holder name: "+accountHolder);
		System.out.println("Current balance: Rs. "+balance);
	}


void deposit(double amount){
	if(amount<0){
		System.out.println("Invalid Deposit Amount!");
	}
	else{
		balance+=amount;
		System.out.println("Your amount RS."+amount+" has been deposited successfully ");
		System.out.println("Your current balance is Rs."+balance);
	}
	
}
}
class BankApp{
	
	public static void main(String[]args){
		
		Scanner ns=new Scanner(System.in);
		Scanner as=new Scanner(System.in);
		System.out.println("Enter the account holder name:");
		String name=ns.nextLine();
		
		BankAccount ba=new BankAccount(name);
		ba.displayAccountInfo();
		System.out.println("Enter deposit amount");
		double depositAmount=as.nextDouble();
		ba.deposit(depositAmount);
		
		/*ba.deposit(5000);
		ba.deposit(-100);*/
	
	}
}


