package com.ssm.pojo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

public class SsmUser {
	private int id;
	private String name;
	private Date ctime;
	private Timestamp timestamp;
	private List<SsmDepartment> dpmt;
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
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public List<SsmDepartment> getDpmt() {
		return dpmt;
	}
	public void setDpmt(List<SsmDepartment> dpmt) {
		this.dpmt = dpmt;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
}
