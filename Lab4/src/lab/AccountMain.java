package lab;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person obj=new Person();
		Person obj2=new Person();
		obj.setName("Kaith");
		obj.setAge(28);
		Account acc=new Account();
		acc.setAccNum(9837829L);
		acc.setBalance(3000);
		acc.setAccHolder(obj);
		
		obj2.setName("Smith");
		obj2.setAge(25);
		Account acc2=new Account();
		acc2.setAccNum(9837888L);
		acc2.setBalance(2000);
		acc2.setAccHolder(obj2);
		
		System.out.println("Intitially:");
		System.out.println(acc);
		System.out.println(acc2);
		System.out.println("Updated:");
		acc.withdraw(2000);
		acc2.deposit(2000);
		System.out.println(acc);
		System.out.println(acc2);
		
	}
}
