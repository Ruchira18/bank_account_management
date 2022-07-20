package com.Bank_Account_Management.dao;

import java.util.ArrayList;

import com.Bank_Account_Management.entity.BankAcc;



public class BankAccountDao {
	private ArrayList<BankAcc> blist = new ArrayList<BankAcc>();

	public String addAccount(BankAcc a) {
		blist.add(a);
		return "Account added successfully...";
	}


	public BankAcc viewAccount(int AccNo) {
		for(BankAcc a:blist)
		{
			if(a.getAccNo() == AccNo)
			{
				return a;
			}
		}
		return null;
	}


	public ArrayList<BankAcc> viewAccounts() {
		return blist;
	}


	public String updateAccount(BankAcc a) {
		for(BankAcc b1:blist)
		{
			if(b1.getAccNo() == a.getAccNo())
			{
				b1.setName(a.getName());
				b1.setAccType(a.getAccType());
				b1.setBalance(a.getBalance());
				return "Account updated successfully...";
			}
		}
		blist.add(a);
		return "Account added successfully...";
	}


	public String deleteAccount(int AccNo) {
		for(int i=0; i<blist.size(); i++)
		{
			if(blist.get(i).getAccNo() == AccNo)
			{
				blist.remove(blist.get(i));
				return "Account deleted Successfully";
			}
		}
		return "Account not found";

	}
}
