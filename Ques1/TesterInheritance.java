package Ques1;

public class TesterInheritance 
{

	public static void main(String[] args) 
	{
		BankAccount BA  = new BankAccount();
		BA.deposit();
		BA.withdraw();
		BA.getBalance();
		CheckingAccount CA = new CheckingAccount();
		CA.deductFee();
		SavingAccount SA = new SavingAccount();
		SA.addInterest();
	
	}

}
