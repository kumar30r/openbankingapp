package com.betterbanking.transaction;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {
	
	@Test
	void getTransactionTest(@Autowired MockMvc mvc) throws Exception {
		System.out.println("Testing Controller");
		//ResultActions result = mvc.perform(get("/transactions/236782"));
		//result.andDo(MockMvcResultHandlers.print());
		mvc.perform(get("/transactions/236782"))
			.andExpect(status().isOk())
			.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
		
		
	}
}
