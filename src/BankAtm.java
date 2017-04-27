// BankAtm class 
public class BankAtm {	
	//properties
	int atmId;
	String bankName;
	String location;
	double balance;
	
	//constructor to initialize variables or properties
	public BankAtm(int atmId, String bankName, String location, int balance) {
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	//methods
	public void withdraw(double amount )throws BankATMException{
		
		double newAccountBalance=10000;
		if(balance<newAccountBalance|(balance<10000)){
			throw new BankATMException("Balance is less than 10000. Cannot withdraw");
			
		}
		else{
			newAccountBalance=balance-amount;
			balance=newAccountBalance;
			System.out.println("Balance is "+balance);
			
	}}
	public void deposit(double amount)throws BankATMException {
		double newAccountBalance=10000;
		if(amount<0.0){
			throw new BankATMException("cannot deposit");
			
	}else{
		newAccountBalance =balance+amount;
		balance=newAccountBalance;
		
		System.out.println("balance is"+balance);
	}
	
	

	}}
