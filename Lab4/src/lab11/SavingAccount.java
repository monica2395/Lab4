package lab11;

public class SavingAccount extends Account {
	private final double minBalance=500;
	private double bal=super.getBalance();
	
	public SavingAccount(long accNum, double balance, Person accHolder, double bal) {
		super(accNum, balance, accHolder);
		this.bal = bal;
	}

	public void withdraw(double wamount) {
		double x=0.0;
		if((bal -wamount)>minBalance) {
			x=bal-wamount;
		}
		else {
			System.out.println("Not sufficient amount");
			x=bal;
		}
		super.setBalance(x);
	}

}
