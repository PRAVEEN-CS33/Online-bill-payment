package com.iamneo.security.entity;


public class Bill {
	private String email;
	private Long bmobilenumber;
	private String type;
	private String operator;
	private String circle;
	private Long amount;
	
    public Bill() {};
	public Bill(String email, Long mobilenumber, String type, String operator, String circle, Long amount) {
		super();
		this.email = email;
		this.bmobilenumber = mobilenumber;
		this.type = type;
		this.operator = operator;
		this.circle = circle;
		this.amount = amount;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getbMobilenumber() {
		return bmobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.bmobilenumber = mobilenumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	 	
	 	
}
