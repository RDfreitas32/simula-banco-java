package bank.method;

import custom.exception.SaldoInsuficienteException;

public class FunctionsAccount {
	
	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public FunctionsAccount(int number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
		
	public void setDeposit(Double deposit) {
		this.balance =+ deposit;
		
	}
	
	public void setWithdraw(Double withDraw) {		
		
		if (withDraw > this.balance) {
			 throw new SaldoInsuficienteException("The value should be less than avaliable balance!");	 
		}
		else if (withDraw > this.withdrawLimit) {
			throw new SaldoInsuficienteException("The value should be less than Withdraw Limit!");
		}
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

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance, Double withdraw) {
		this.balance = balance - withdraw;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
		
	}
}
