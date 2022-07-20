package com.Bank_Account_Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank_Account_Management.entity.BankAcc;

public interface BankAccountRepo extends JpaRepository<BankAcc,Integer> {

}
