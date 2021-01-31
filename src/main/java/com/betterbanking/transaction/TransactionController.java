package com.betterbanking.transaction;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces="application/json")
@CrossOrigin("*")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
    @GetMapping("/transactions/{accountNumber}")
    public ResponseEntity<Collection<Transaction>> getTransaction(@PathVariable("accountNumber") long accountNumber) {
    	Collection<Transaction> result = transactionService.findAllByAccountNumber(accountNumber);
    	if (result != null && !result.isEmpty())
    		return new ResponseEntity<>(result, HttpStatus.OK);
    	else
    		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
