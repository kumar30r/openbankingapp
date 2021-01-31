package com.betterbanking.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Transaction {

	private String type;
	private LocalDate date;
	private long accountNumber;
	private String currency;
	private BigDecimal amount;
	private String merchantName;
	private byte[] merchantLogo;
	
	
}
