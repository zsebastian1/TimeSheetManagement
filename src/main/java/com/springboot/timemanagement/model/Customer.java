package com.springboot.timemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "name", unique = false, nullable = false)
	private String name;

	@Column(name = "comment", unique = false, nullable = false)
	private String comment;

	@Column(name = "country", unique = false, nullable = false)
	private String country;

	@Column(name = "companyName", unique = false, nullable = false)
	private String companyName;

	@Column(name = "account", unique = false, nullable = false)
	private String account;

	@Column(name = "timezone", unique = false, nullable = false)
	private String timezone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String comment, String country, String companyName, String account,
			String timezone) {
		super();
		this.id = id;
		this.name = name;
		this.comment = comment;
		this.country = country;
		this.companyName = companyName;
		this.account = account;
		this.timezone = timezone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", comment=" + comment + ", country=" + country
				+ ", companyName=" + companyName + ", account=" + account + ", timezone=" + timezone + "]";
	}

}
