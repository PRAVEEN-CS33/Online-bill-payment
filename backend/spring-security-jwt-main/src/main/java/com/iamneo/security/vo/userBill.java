package com.iamneo.security.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userBill {
	private String email;
	private Long bmobilenumber;
	private String type;
	private String operator;
	private String circle;
	private Long amount;
}
