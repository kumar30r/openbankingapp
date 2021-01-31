package com.betterbanking.transaction;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class TransactionComponentTest {

	@Test
	void getTransactionTest() throws Exception {
		given().
		when().
			get("/transactions/236782").
		then().
	        assertThat().
	        statusCode(200).
	        and().
	        contentType(ContentType.JSON);
		
	}
}
