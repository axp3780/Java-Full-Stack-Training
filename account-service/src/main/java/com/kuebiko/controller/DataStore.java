package com.kuebiko.controller;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	static private  List<AccountDTO> accountDTOs = new ArrayList<AccountDTO>();
	
	public static List<AccountDTO> getAccountDTOs() {
		return accountDTOs;
	}
}
