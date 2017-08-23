package com.ssm.pojo;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class SsmDepartment {
	private int id;
	private String name;
	private Date ctime;
	private Timestamp timestamp;
	private List<SsmUser> user;
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
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public List<SsmUser> getUser() {
		return user;
	}
	public void setUser(List<SsmUser> user) {
		this.user = user;
	}
}
