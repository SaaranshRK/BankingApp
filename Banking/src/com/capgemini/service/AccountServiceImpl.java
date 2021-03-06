package com.capgemini.service;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientInitialBalanceException;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository){
		this.accountRepository=accountRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.AccountService#createAccount(int, int)
	 */
	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialBalanceException{
		if(amount<500)
		{
			throw new InsufficientInitialBalanceException();
		}
		Account account=new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		
		if(accountRepository.createAccount(account))
		{
			return account;
		}
		
		return null;	
	}
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.AccountService#depositAmount(int, int)
	 */
	@Override
	public int depositAmount(int accountNumber,int amount)throws InvalidAccountNumberException
	{
		return 1;
	}
	
	
	 
	/* (non-Javadoc)
	 * @see com.capgemini.service.AccountService#withdrawAmount(int, int)
	 */
	@Override
	public int withdrawAmount(int accountNumber,int amount)throws InvalidAccountNumberException,InsufficientBalanceException
	{
		return 1;
	}


}
