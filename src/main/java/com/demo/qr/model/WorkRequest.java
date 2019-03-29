package com.demo.qr.model;

import javax.persistence.Entity;             //userWRType to WRType
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Work_Request")
public class WorkRequest {
	@Id	
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="workflow_seq")
	@SequenceGenerator(name="workflow_seq",sequenceName="workflow_seq",allocationSize=1)
	private int workReqId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="wr_type_id")
	private WorkRequestType workRequestType;
	
	private char qrNeeded;
	
	public WorkRequest() {
		super();
	}

	public WorkRequest(int workReqId, char qrNeeded) {
		super();
		this.workReqId = workReqId;
		this.qrNeeded = qrNeeded;
	}

	public int getWorkReqId() {
		return workReqId;
	}

	public void setWorkReqId(int workReqId) {
		this.workReqId = workReqId;
	}

	public WorkRequestType getWorkRequestType() {
		return workRequestType;
	}

	public void setWorkRequestType(WorkRequestType workRequestType) {
		this.workRequestType = workRequestType;
	}

	public char getQrNeeded() {
		return qrNeeded;
	}

	public void setQrNeeded(char qrNeeded) {
		this.qrNeeded = qrNeeded;
	}

	@Override
	public String toString() {
		return "WorkRequest [workReqId=" + workReqId + ", workRequestType=" + workRequestType + ", qrNeeded=" + qrNeeded
				+ "]";
	}
	

}
