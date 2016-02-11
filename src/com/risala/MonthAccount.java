package com.risala;

import com.noufal.search.ISearchable;



public class MonthAccount implements ISearchable {
	private int numberOfCopies;
	private Month month;
	private int year;
	private int balance;
	
	
	public MonthAccount(Month month,int year){
		this.month = month;
		this.year = year;
	}
	
	
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public Month getMonth() {
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
