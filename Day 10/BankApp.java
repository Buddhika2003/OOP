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