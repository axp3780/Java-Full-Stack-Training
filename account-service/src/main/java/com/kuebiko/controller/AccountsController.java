package com.kuebiko.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kuebiko.sevice.AccountService;

@Controller
public class AccountsController {
	
	@Autowired
	private AccountService accountService;
	
	
	@GetMapping("createAccount")
	public String showAccount() {
		return "createAccount";
	}
	
	
	
	
	@PostMapping("createAccount")
	public String createAccount(@ModelAttribute AccountDTO accountDTO, Model model) {
		accountDTO.setDateOfEntry(new Timestamp(new Date().getTime()));
		accountService.create(accountDTO);
		model.addAttribute("message", "Data has been stored.");
		return "createAccount";

	}
	
	@GetMapping("showAccounts")
	public String showAccounts(Model model) {
		List<AccountDTO> accountDTOs=accountService.fetchData();
		model.addAttribute("accountDTOs", accountDTOs);
		return "showAccounts";
	}
	
	@GetMapping("deleteAccount")
	public String deleteAccount(@RequestParam int aid,Model model) {
		accountService.deleteByAccountID(aid);
		List<AccountDTO> accountDTOs=accountService.fetchData();
		model.addAttribute("accountDTOs",accountDTOs);
		return "showAccounts";
	}
	
	//edit for EDIT
	@GetMapping("/editAccount")
	public String showEditSignup(@RequestParam int aid, Model model) {
	    AccountDTO accountDTO = accountService.findByAccountID(aid);
	    model.addAttribute("accountDTO", accountDTO);
	    return "editAccount"; // editsignup.jsp
	}
	
	@PostMapping("/updateAccount")
	public String updateSignupPost(@ModelAttribute AccountDTO accountDTO, Model model) {
		accountService.updateData(accountDTO);
		List<AccountDTO>   dtos=accountService.fetchData();
		  model.addAttribute("accountDTOs", dtos);
		return "showAccounts"; // showAccounts.jsp
	}
	
}
