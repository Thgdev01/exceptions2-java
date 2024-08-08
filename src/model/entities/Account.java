package model.entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}


	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(double amount) {
		this.balance = amount + balance;
	}
	
	public void withdraw(double amount) {
		this.balance = amount - balance;
	}
}
