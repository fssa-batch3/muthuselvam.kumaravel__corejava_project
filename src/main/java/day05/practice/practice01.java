package day05.practice;

class Account  {
	String accNo;
	double balance;
	
}

//Create an implementation of the below Interface
public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance();
}