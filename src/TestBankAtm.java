public class TestBankAtm {
public static void main(String[] args) {
	BankAtm b1=new BankAtm(1010, "citi bank", "navi mumbai", 10000);
	BankAtm b2=new BankAtm(1010, "citi bank", "navi mumbai", 10000);
	BankAtm b3=new BankAtm(1010, "citi bank", "navi mumbai", 1000);
	try {
		b1.withdraw(400);
		b1.deposit(300);
	}catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
	try {
		b2.withdraw(700);
		b2.deposit(200);
	}catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
	try {
		b3.withdraw(12500);
		b3.deposit(500);
	}catch(Exception e) {
		System.out.println("Exception occurred "+e);
	}
}
}
