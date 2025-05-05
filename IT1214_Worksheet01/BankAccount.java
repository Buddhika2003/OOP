//Q05
class BankAccount{
	private String accountHolderName;
	private double balance;

	BankAccount(String accountHolderName,double balance){
		this.accountHolderName=accountHolderName;
		this.balance=balance;

	}

	public String getAccountHolderName(){
		return accountHolderName;
	}

	public double getBalance(){
		return balance;
	}

	public void setaccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}

	public void setBalance(double balance){
		this.balance=balance;
	}

	public void deposit(double amount){
			if(amount>0){
				setBalance(getBalance() + amount);
				System.out.println("Your Rs"+amount+" Deposited Successfully.");
				}
				else{
					System.out.println("Invalid amount!");
				}
			
	}
	public void withdraw(double amount){
			if(amount>0 && getBalance() >= amount){
				setBalance(getBalance() - amount);
				System.out.println("Your Rs"+amount+" withdraw Successfull.");
			}
			else{
				System.out.println("Insuficient Balance.");
			}
	}

	public void displayBalance(){
		System.out.println("Account Holder "+accountHolderName);
		System.out.println("Your balance : Rs."+balance);
	}
	
}

class BankAccountMain{
	public static void main(String[]args){
		BankAccount account=new BankAccount("Buddhika",1000);
		account.displayBalance();
		account.deposit(5000);
		account.withdraw(1500);
		account.displayBalance();
	


	}
}


