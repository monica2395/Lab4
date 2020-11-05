package lab11;

public class CurrentAccount extends Account{
	private final double overdraft=-50.00;
	private double bal=super.getBalance();
	
	public CurrentAccount(long accNum, double balance, Person accHolder, double bal) {
		super(accNum, balance, accHolder);
		this.bal = bal;
	}

	public void withdraw(double wamount) {
		double x=0.0;
		if((bal -wamount)>overdraft) {
			x=bal-wamount;
		}
		else {
			System.out.println("Not sufficient amount");
			x=bal;
		}
		super.setBalance(x);
	}
	
	

}
