package com.springboot.timemanagement.model;

import java.sql.Date;
import java.sql.Time;

public class Timesheet {

	private int id;

	private Date date;

	private Time begin;

	private Time end;

	private double rate;

	private int idProject;

	private int idUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getBegin() {
		return begin;
	}

	public void setBegin(Time begin) {
		this.begin = begin;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Timesheet(int id, Date date, Time begin, Time end, double rate, int idProject, int idUser) {
		super();
		this.id = id;
		this.date = date;
		this.begin = begin;
		this.end = end;
		this.rate = rate;
		this.idProject = idProject;
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return "Timesheet [id=" + id + ", date=" + date + ", begin=" + begin + ", end=" + end + ", rate=" + rate
				+ ", idProject=" + idProject + ", idUser=" + idUser + "]";
	}

}
