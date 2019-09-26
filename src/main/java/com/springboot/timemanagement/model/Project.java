package com.springboot.timemanagement.model;

public class Project {

	private int id;

	private String name;

	private int idCustomer;

	private String comment;

	private String orderNumber;

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

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String name, int idCustomer, String comment, String orderNumber) {
		super();
		this.id = id;
		this.name = name;
		this.idCustomer = idCustomer;
		this.comment = comment;
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", idCustomer=" + idCustomer + ", comment=" + comment
				+ ", orderNumber=" + orderNumber + "]";
	}

}
