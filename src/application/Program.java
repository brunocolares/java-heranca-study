package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Bruno", 1700.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Vitória", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Cláudia", 0.0, 200.0);
		
		// O objeto real alocado na memória é do tipo SavingsAccount
		// mas os métodos e atributos são definidos pela variável, desde que não sobreescritos
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Emprestimo realizado.");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
	}
}
