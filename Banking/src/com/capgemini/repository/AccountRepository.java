package com.capgemini.repository;

import com.capgemini.model.*;

public interface AccountRepository {

	boolean createAccount(Account account);
	Account searchAccount(int AccountNumber);
}
