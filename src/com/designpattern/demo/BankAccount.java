/*
 * Builder design pattern
 * It is commonly use to handle large object creation or when we have large no of different parameters to set.
 * 
 */




package com.designpattern.demo;

public class BankAccount {
	

	public long accountNumber;
	public String owner;
	public String branch;
	public double balance;
	public double interestRate;
	public static class Builder{
		private long accountNumber;
		private String owner;
		private String branch;
		private double balance;
		private double interestRate;
		
		public Builder(long accountNumber) {
			this.accountNumber=accountNumber;
		}
		
		public Builder withOwner(String owner) {
			this.owner=owner;
			return this;                                
		}
		
		public Builder atBranch(String branch) {
			this.branch=branch;
			return this;
		}
		
		public Builder openingBalance(double balance) {
			this.balance=balance;
			return this;
		}
		
		public Builder atRate(double interestRate) {
			this.interestRate=interestRate;
			return this;
		}
		
		public BankAccount build() {
			BankAccount account=new BankAccount();
			account.accountNumber=this.accountNumber;
			account.owner=this.owner;
			account.branch=this.branch;
			account.balance=this.balance;
			account.interestRate=this.interestRate;
			
			
			return account;
		}
		
	}
	private BankAccount() {
		
	}
	//Getters and setters are omitted for brevity.
	

	BankAccount account=new BankAccount.Builder(1234L).withOwner("Spat")
													  .atBranch("Springfield")
													  .openingBalance(100)
													  .atRate(2.5)
													  .build();
	
	BankAccount anotherAccount=new BankAccount.Builder(5674L)
			                                  .withOwner("Homer")
			                                  .atBranch("woodbridge")
			                                  .openingBalance(100)
			                                  .atRate(2.6)
			                                  .build();
	
	
	
	
	
	
	
	
	
	
}
