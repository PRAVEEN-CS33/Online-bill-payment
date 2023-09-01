package com.payease.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "bill", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Bill {
	@Id
	@GeneratedValue
	private Long id;
	private String email;
	private Long bmobilenumber;
	private String type;
	private String operator;
	private String circle;
	private Long amount;
	
	public Bill(Long id, String email, Long mobilenumber, String type, String operator, String circle, Long amount) {
		super();
		this.id = id;
		this.email = email;
		this.bmobilenumber = mobilenumber;
		this.type = type;
		this.operator = operator;
		this.circle = circle;
		this.amount = amount;
	}
	
	public Bill() {};
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
