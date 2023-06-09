package com.kuebiko.dao;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="accounts_tbl")

public class AccountEntity {
		
	private int accountId;
	private String name;
	private String type;
	private String email;
	private String description;
	private int balance;
	private Timestamp dateOfEntry;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Timestamp getDateOfEntry() {
		return dateOfEntry;
	}
	public void setDateOfEntry(Timestamp dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	
}
