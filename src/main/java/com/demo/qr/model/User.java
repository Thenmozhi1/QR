package com.demo.qr.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	private int userId;
	private String userName;
	
	 @OneToOne(mappedBy="user") 
	 private WorkRequestType workRequestType;
	 
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<WorkRequest> workRequest = new ArrayList<>();

	public User() {

	}

	public User(String userName) {
		super();
		this.userName = userName;
	
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public WorkRequestType getWorkRequestType() {
		return workRequestType;
	}

	public void setWorkRequestType(WorkRequestType workRequestType) {
		this.workRequestType = workRequestType;
	}

	public List<WorkRequest> getWorkRequest() {
		return workRequest;
	}

	public void setWorkRequest(List<WorkRequest> workRequest) {
		this.workRequest = workRequest;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", workRequestType=" + workRequestType
				+ ", workRequest=" + workRequest + "]";
	}

}

