package com.betterbanking.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TransactionServiceTest {
	
    @BeforeAll
    public static void beforeClass() {
        
    }

    @Test
    public void findAllByAccountNumberTest() {
    	System.out.println("Testing findAllByAccountNumberTest");
    	TransactionService service = new TransactionService();
        Collection<Transaction> results = service.findAllByAccountNumber(3456789);
        
        assertNotNull(results);
        assertEquals(results.size(), 3);
    }
}
