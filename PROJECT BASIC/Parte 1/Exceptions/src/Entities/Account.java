package Entities;

import Exceptions.DomainException;

public class Account {
	public String Holder;
	public Double WithdrawLimit;
	private Double Balance;
	private Integer Number;

	public String getHolder() {
		return Holder;
	}
	public void setHolder(String holder) {
		Holder = holder;
	}

	public Double getWithdrawLimit() {
		return WithdrawLimit;
	}
	public void setWithdrawLimit(Double withdraLimit) {
		WithdrawLimit = withdraLimit;
	}

	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}

	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	
	public Account(String holder, Double withdrawLimit, Double balance, Integer number) {
		super();
		Holder = holder;
		WithdrawLimit = withdrawLimit;
		Balance = balance;
		Number = number;
	}

	public void deposit(double amount) {
		Balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > WithdrawLimit) {
			throw new DomainException ("The amount exceeds withdraw limit!");
		}
		
		if(amount > Balance) {
			throw new DomainException("Not enough balance!");
		}
		
		Balance -= amount;
	}
	
}
