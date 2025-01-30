package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		/* Testando sobreposição de metódos */
		Account acc1 = new Account(1001, "Bruno", 1700.0);
		
		acc1.withDraw(200);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Vitória", 1700.0, 0.01);
		acc2.withDraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Cláudia", 1700.0, 0.01);
		acc3.withDraw(200);
		System.out.println(acc3.getBalance());
		
		
	}

}
