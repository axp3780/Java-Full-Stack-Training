package com.kuebiko.sevice;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.kuebiko.controller.AccountDTO;

@Service
public class AccountService {

	@Autowired
	//this bin is created by spring boot because of the jar file added in pom.xml
	private DataSource dataSource;
	
	
	public void create (AccountDTO accountDTO) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into accounts_tbl(Name,Type,Email,Description,Balance,DateOfEntry) values(?,?,?,?,?,?)";
		Object data[] = {accountDTO.getName(),accountDTO.getType(),accountDTO.getEmail(),accountDTO.getDescription(),accountDTO.getBalance(),accountDTO.getDateOfEntry()};
		jdbcTemplate.update(sql,data);
	}
	
	//sql injection????
	public void deleteByAccountID (int accountID) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "delete from accounts_tbl where AccountID="+accountID;
		jdbcTemplate.update(sql);
	}
	
	
	public List<AccountDTO> fetchData () {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM accounts_tbl";
		List<AccountDTO> accountDTOs=jdbcTemplate.query(sql, new BeanPropertyRowMapper(AccountDTO.class));
		return accountDTOs;
	
	}
	
	/*
	 * public List<AccountDTO> findByAccountID(int accountID) { JdbcTemplate
	 * jdbcTemplate = new JdbcTemplate(dataSource); String fecthDataQuery =
	 * "select AccountID, Name,Type,Email,Description,Balance,DateOfEntry from accounts_tbl where AccountID ="
	 * +accountID; List<AccountDTO> accountDTOs=jdbcTemplate.query(fecthDataQuery,
	 * new BeanPropertyRowMapper(AccountDTO.class)); return accountDTOs; }
	 */
	
	
	  public AccountDTO findByAccountID(int accountID) { 
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); 
		  String fecthDataQuery ="select AccountID, Name,Type,Email,Description,Balance,DateOfEntry from accounts_tbl where AccountID = ?";
		  List<AccountDTO> accountDTOs=jdbcTemplate.query(fecthDataQuery,new Object[]{accountID}, new BeanPropertyRowMapper(AccountDTO.class)); 
		  return accountDTOs.get(0);
	  }
	 

	public void updateData(AccountDTO accountDTO) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "update accounts_tbl set Name =?, Type=? ,Email= ?,Description= ?,Balance= ?,DateOfEntry=? where AccountID = ?";
		Object data[] = {accountDTO.getName(),accountDTO.getType(),accountDTO.getEmail(),accountDTO.getDescription(),accountDTO.getBalance(),accountDTO.getDateOfEntry(), accountDTO.getAccountId()};
		jdbcTemplate.update(sql, data);
		
	}

}
