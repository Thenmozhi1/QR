package com.demo.qr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "Work_Request_Type")

public class WorkRequestType {
	@Id	
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="workflow_seq")
	@SequenceGenerator(name="workflow_seq",sequenceName="workflow_seq",allocationSize=1)
	private int workReqTypeId;
	private double qrBucketSize;
	
	 @OneToOne(mappedBy="user") 
	 private WorkRequest workRequest;
	 
	public WorkRequestType() {
		super();
	}

	public WorkRequestType(double qrBucketSize) {
		super();
		this.qrBucketSize = qrBucketSize;
	}

	public int getWorkReqTypeId() {
		return workReqTypeId;
	}

	public void setWorkReqTypeId(int workReqTypeId) {
		this.workReqTypeId = workReqTypeId;
	}

	public double getQrBucketSize() {
		return qrBucketSize;
	}

	public void setQrBucketSize(double qrBucketSize) {
		this.qrBucketSize = qrBucketSize;
	}

	public WorkRequest getWorkRequest() {
		return workRequest;
	}

	public void setWorkRequest(WorkRequest workRequest) {
		this.workRequest = workRequest;
	}

	@Override
	public String toString() {
		return "WorkRequestType [workReqTypeId=" + workReqTypeId + ", qrBucketSize=" + qrBucketSize + ", workRequest="
				+ workRequest + "]";
	}
	
}
