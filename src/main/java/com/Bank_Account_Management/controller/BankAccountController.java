package com.Bank_Account_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Bank_Account_Management.entity.BankAcc;
import com.Bank_Account_Management.service.BankAccountService;


@Controller
public class BankAccountController {
	@Autowired
	private BankAccountService bservice;
	
	
	@RequestMapping("bankHome")
	public String bankHome()
	{
		return "bankHome.jsp";
	}
	
	@RequestMapping("addAccount")
	@ResponseBody
	public String addAccount(BankAcc a)
	{
		return bservice.addAccount(a);
	}
	
	@RequestMapping("viewAccount")
	public ModelAndView viewAccount(int AccNo)
	{
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("displayAccount.jsp");
		mvc.addObject("mode","single");
		
		String a=bservice.viewAccount(AccNo);
		if(a!=null)
		{
			mvc.addObject("flag",true);
			mvc.addObject("result",a);
			return mvc;
		}
		mvc.addObject("flag",false);
		mvc.addObject("result","Account not found");
		return mvc;
	}
	
	@RequestMapping("viewAccounts")
	public ModelAndView viewAccounts()
	{
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("displayAccount.jsp");
		mvc.addObject("mode","list");
		mvc.addObject("result",bservice.viewAccounts());
		return mvc;
	}
	@RequestMapping("deleteAccount")
	@ResponseBody
	public String deleteAccount(int AccNo)
	{
		return bservice.deleteAccount(AccNo);
	}
	
	@RequestMapping("updateAccount")
	@ResponseBody
	public String updateAccount(BankAcc a)
	{
		return bservice.updateAccount(a);
	}
}
