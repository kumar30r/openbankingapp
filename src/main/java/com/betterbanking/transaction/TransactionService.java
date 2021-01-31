package com.betterbanking.transaction;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component("transactionService")
public class TransactionService {

	public Collection<Transaction> findAllByAccountNumber(long accountNumber)
	{
		Transaction t1 = new Transaction();
		Transaction t2 = new Transaction();
		Transaction t3 = new Transaction();
		Collection<Transaction> result = Arrays.asList(t1,t2,t3);
		return result;
		
		//return Collections.emptyList();
	}
}
