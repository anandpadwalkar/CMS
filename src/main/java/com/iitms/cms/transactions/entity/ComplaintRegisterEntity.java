package com.iitms.cms.transactions.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.iitms.cms.masters.entity.ComplaintDepartment;

@Entity
@Table(name = "complaint_register")
public class ComplaintRegisterEntity implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "complaintdate")
	@DateTimeFormat(pattern = "DD/MM/YYYY")
	@Temporal(TemporalType.DATE)
	private Date complaintDate;
	@Column(name = "complainteeid")
	private int complainteeId;
	@Column(name = "deptid")
	private int deptId;
	@Column(name = "complainttypeid")
	private int complaintTypeId;
	@Column(name = "complaintdetails")
	private String complaintDetails;
	@Column(name = "complaintlocation")
	private String complaintLocation;
	@Column(name = "complainteephonenumber")
	private String complainteePhoneNumber;
	@Column(name = "complaintstatusid")
	private int complaintStatusId;
	@Column(name = "allotmentstatus")
	private int allotmentStatus;
	
	@Transient
	private String compDateStr;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deptId", referencedColumnName = "deptid", insertable = false, updatable = false, nullable = false)
	private ComplaintDepartment complaintDepartment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "complaintStatusId", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
	private ComplaintStatusEntity complaintStatusEntity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	public int getComplainteeId() {
		return complainteeId;
	}
	public void setComplainteeId(int complainteeId) {
		this.complainteeId = complainteeId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getComplaintDetails() {
		return complaintDetails;
	}
	public void setComplaintDetails(String complaintDetails) {
		this.complaintDetails = complaintDetails;
	}
	public String getComplaintLocation() {
		return complaintLocation;
	}
	public void setComplaintLocation(String complaintLocation) {
		this.complaintLocation = complaintLocation;
	}
	public String getComplainteePhoneNumber() {
		return complainteePhoneNumber;
	}
	public void setComplainteePhoneNumber(String complainteePhoneNumber) {
		this.complainteePhoneNumber = complainteePhoneNumber;
	}
	public int getComplaintTypeId() {
		return complaintTypeId;
	}
	public void setComplaintTypeId(int complaintTypeId) {
		this.complaintTypeId = complaintTypeId;
	}
	public String getCompDateStr() {
		return compDateStr;
	}
	public void setCompDateStr(String compDateStr) {
		this.compDateStr = compDateStr;
	}
	
	
	
	public int getComplaintStatusId() {
		return complaintStatusId;
	}
	public void setComplaintStatusId(int complaintStatusId) {
		this.complaintStatusId = complaintStatusId;
	}
	public ComplaintDepartment getComplaintDepartment() {
		return complaintDepartment;
	}
	public void setComplaintDepartment(ComplaintDepartment complaintDepartment) {
		this.complaintDepartment = complaintDepartment;
	}
	public int getAllotmentStatus() {
		return allotmentStatus;
	}
	public void setAllotmentStatus(int allotmentStatus) {
		this.allotmentStatus = allotmentStatus;
	}
	public ComplaintStatusEntity getComplaintStatusEntity() {
		return complaintStatusEntity;
	}
	public void setComplaintStatusEntity(ComplaintStatusEntity complaintStatusEntity) {
		this.complaintStatusEntity = complaintStatusEntity;
	}
	
	
}
