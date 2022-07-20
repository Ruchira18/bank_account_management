package com.Bank_Account_Management.service;

import java.util.ArrayList;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank_Account_Management.dao.BankAccountRepo;
import com.Bank_Account_Management.entity.BankAcc;

@Service

public class BankAccountServiceImplementation implements BankAccountService {
	@Autowired
	BankAccountRepo barepo;
	
	
	public String addAccount(BankAcc a) {
		barepo.save(a);
		return "Account Added Successfully...";
	}

	
	public ArrayList<BankAcc> viewAccounts() {
		return (ArrayList<BankAcc>) barepo.findAll();
	}

	
	public String viewAccount(int AccNo) {
		try {
			BankAcc a=barepo.findById(AccNo).orElseThrow(AccountNotFoundException::new);
			return a.toString();
			/*if(a!=null)
			{
				return a.toString();
			}
			else
			{
				throw new AccountNotFountException();
			}
		}*/
		}
		catch(AccountNotFoundException e)
		{
			return e.toString();
		}
		
		
	}

	
	public String updateAccount(BankAcc a) {
		BankAcc a1 = barepo.findById(a.getAccNo()).orElse(null);
		if(a1!=null)
		{
			barepo.delete(a1);
		}
		barepo.save(a);
		return "Account Updated Successfully....!!!!";
	}


	public String deleteAccount(int AccNo) {
		try{
			BankAcc a1 = barepo.findById(AccNo).orElse(null);
		
		if(a1!=null)
		{
			barepo.delete(a1);
			return "Account deleted";
		}
		else
		{
			throw new AccountNotFoundException();
		}
		}
		catch(AccountNotFoundException e)
		{
			return e.toString();
		}
		
	}
}
