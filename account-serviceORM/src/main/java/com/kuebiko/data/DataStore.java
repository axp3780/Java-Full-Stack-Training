package com.kuebiko.data;

import java.util.ArrayList;
import java.util.List;

import com.kuebiko.dto.AccountDTO;

public class DataStore {
	static private  List<AccountDTO> accountDTOs = new ArrayList<AccountDTO>();
	
	public static List<AccountDTO> getAccountDTOs() {
		return accountDTOs;
	}
}
