package com.faith.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AssetMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int am_id;

	@Column(name = "am_type", nullable = false)
	private String am_type;

	@Column(name = "am_make", nullable = false)
	private String am_make;

	@Column(name = "am_model", nullable = false)
	private String am_model;

	@Column(name = "am_snumber", nullable = false)
	private String am_snumber;

	@Column(name = "am_myear", nullable = false)
	private String am_myear;

	@Column(name = "am_pdate", nullable = false)
	private Date am_pdate;

	@Column(name = "am_warranty", nullable = false)
	private String am_warranty;

	private Date am_from;

	private Date am_to;
	
	private String status;

	// getters and setters
	public int getAm_id() {
		return am_id;
	}

	public void setAm_id(int am_id) {
		this.am_id = am_id;
	}

	public String getAm_type() {
		return am_type;
	}

	public void setAm_type(String am_type) {
		this.am_type = am_type;
	}

	public String getAm_make() {
		return am_make;
	}

	public void setAm_make(String am_make) {
		this.am_make = am_make;
	}

	public String getAm_model() {
		return am_model;
	}

	public void setAm_model(String am_model) {
		this.am_model = am_model;
	}

	public String getAm_snumber() {
		return am_snumber;
	}

	public void setAm_snumber(String am_snumber) {
		this.am_snumber = am_snumber;
	}

	public String getAm_myear() {
		return am_myear;
	}

	public void setAm_myear(String am_myear) {
		this.am_myear = am_myear;
	}

	public Date getAm_pdate() {
		return am_pdate;
	}

	public void setAm_pdate(Date am_pdate) {
		this.am_pdate = am_pdate;
	}

	public String getAm_warranty() {
		return am_warranty;
	}

	public void setAm_warranty(String am_warranty) {
		this.am_warranty = am_warranty;
	}

	public Date getAm_from() {
		return am_from;
	}

	public void setAm_from(Date am_from) {
		this.am_from = am_from;
	}

	public Date getAm_to() {
		return am_to;
	}

	public void setAm_to(Date am_to) {
		this.am_to = am_to;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AssetMaster [am_id=" + am_id + ", am_type=" + am_type
				+ ", am_make=" + am_make + ", am_model=" + am_model
				+ ", am_snumber=" + am_snumber + ", am_myear=" + am_myear
				+ ", am_pdate=" + am_pdate + ", am_warranty=" + am_warranty
				+ ", am_from=" + am_from + ", am_to=" + am_to + ", status=" + status + "]";
	}
	
	

}
