package com.faith.model;

import java.util.Date;

public class Asset_masterModel {

	// instantiating variables
	private int am_id;
	private String am_type;
	private String am_make;
	private String am_model;
	private String am_snumber;
	private String am_myear;
	private Date am_pdate;
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
		return "Asset_masterModel [am_id=" + am_id + ", am_type=" + am_type
				+ ", am_make=" + am_make + ", am_model=" + am_model
				+ ", am_snumber=" + am_snumber + ", am_myear=" + am_myear
				+ ", am_pdate=" + am_pdate + ", am_warranty=" + am_warranty
				+ ", am_from=" + am_from + ", am_to=" + am_to + ", status=" + status + "]";
	}
	
	

}
