package com.kuebiko.controller;

import java.util.ArrayList;
import java.util.List;

import com.kuebiko.dao.AccountEntity;

public class DataStore {
	static private  List<AccountEntity> accountEntities = new ArrayList<AccountEntity>();
	
	public static List<AccountEntity> getAccountEntities() {
		return accountEntities;
	}
}
