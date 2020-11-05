package lab11;


public class AccountMain {
	public static void main(String[] args) {
		Person obj=new Person();
		obj.setName("Kaith");
		obj.setAge(25);
		SavingAccount acc=new SavingAccount(123489L,7000,obj,7000);
		System.out.println(acc);
		acc.withdraw(9000);

		CurrentAccount cacc=new CurrentAccount(123489L,8000,obj,8000);
		System.out.println(cacc);
		cacc.withdraw(400);
	}

}
