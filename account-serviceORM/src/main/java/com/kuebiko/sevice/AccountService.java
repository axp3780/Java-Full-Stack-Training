package com.kuebiko.sevice;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.kuebiko.controller.AccountDTO;
import com.kuebiko.dao.AccountEntity;
import com.kuebiko.dao.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	
	
	//public void create (AccountDTO accountDTO) {
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//String sql = "insert into accounts_tbl(Name,Type,Email,Description,Balance,DateOfEntry) values(?,?,?,?,?,?)";
		//Object data[] = {accountDTO.getName(),accountDTO.getType(),accountDTO.getEmail(),accountDTO.getDescription(),accountDTO.getBalance(),accountDTO.getDateOfEntry()};
		//jdbcTemplate.update(sql,data);
	//}
	
	public void save(AccountEntity accountEntity) {
		accountRepository.save(accountEntity);
	}
	
	public void deleteByAccountID (int accountID) {
		accountRepository.deleteById(accountID);
	}
	
	
	public List<AccountEntity> fetchData () {
		List<AccountEntity> accountEntities= accountRepository.findAll();
		return accountEntities;
	
	}
	
	
	
	  public AccountEntity findByAccountID(int accountId) { 
		  AccountEntity accountEntities= accountRepository.findById(accountId).get();
		  return accountEntities;
		  
	  }
	 

	public void updateData(AccountEntity accountEntity) {
		accountRepository.save(accountEntity);
		
	}

}
