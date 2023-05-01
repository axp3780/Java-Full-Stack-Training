package com.kuebiko.sevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuebiko.dao.AccountEntity;
import com.kuebiko.dao.AccountRepository;
import com.kuebiko.dto.AccountDTO;

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
	
	public void saveOrUpdateData(AccountDTO accountDTO) {
		
		//Dao is taking account Entity not DTO
		//so we use instance of AccountEntity
		AccountEntity accountEntity = new AccountEntity();
		BeanUtils.copyProperties(accountDTO, accountEntity); //class of BeanUtils from spring lets you copy the data from source to target
		accountRepository.save(accountEntity);
	}
	
	public void deleteByAccountID (int accountID) {
		accountRepository.deleteById(accountID);
	}
	
	
	public List<AccountDTO> fetchData () {
		
		List<AccountEntity> accountEntities= accountRepository.findAll();
		List<AccountDTO>accountDTOs = new  ArrayList<>();
		for(AccountEntity entity: accountEntities) {
			
			AccountDTO accountDTO = new AccountDTO();
			BeanUtils.copyProperties(entity, accountDTO);
			accountDTOs.add(accountDTO);
			
		}
		return accountDTOs;
	
	}
	
	
	
	  public AccountDTO findByAccountID(int accountId) { 
		  AccountEntity entity= accountRepository.findById(accountId).get();
		  AccountDTO accountDTO = new AccountDTO();
		  BeanUtils.copyProperties(entity, accountDTO);
		  return accountDTO;
		  
	  }
	 

}
