package com.Bank_Account_Management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAcc {
	@Id
	private int AccNo;
	private String Name;	
	private String AccType;
	private double Balance;
	public BankAcc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAcc(int accNo, String name, String accType, double balance) {
		super();
		AccNo = accNo;
		Name = name;
		AccType = accType;
		Balance = balance;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAccType() {
		return AccType;
	}
	public void setAccType(String accType) {
		AccType = accType;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "BankAcc [AccNo=" + AccNo + ", Name=" + Name + ", AccType=" + AccType + ", Balance=" + Balance + "]";
	}
	
}
