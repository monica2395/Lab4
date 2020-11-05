package lab11;

public class Account{
		private long accNum;
		private double balance;
		private Person accHolder;
		
		
		public Account(long accNum, double balance, Person accHolder) {
			super();
			this.accNum = accNum;
			this.balance = balance;
			this.accHolder = accHolder;
		}
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Person getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person obj) {
			this.accHolder = obj;
		}
		public void deposit(double damount) {
			double y=balance+damount;
			setBalance(y);
		}
		public void withdraw(double wamount) {
			double x=0.0;
			if((balance -wamount)>500) {
				x=balance-wamount;
			}
			else {
				System.out.println("Not sufficient amount");
				x=balance;
			}
			setBalance(x);
		}
		
		public String toString() {
			return accHolder.getName()+"\t"+accHolder.getAge()+"\t"+accNum+"\t"+balance;
		}

		

}



