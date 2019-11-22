package com.faith.model;

import java.util.Date;

public class Purchase_detModel {
	private int pd_id;
	private String pd_order;
	private String pd_type;
	private int pd_qty;
	private String pd_vendor;
	private Date pd_date;
	private Date pd_ddate;
	private String pd_status;

	// getters and setters
	public int getPd_id() {
		return pd_id;
	}

	public void setPd_id(int pd_id) {
		this.pd_id = pd_id;
	}

	public String getPd_order() {
		return pd_order;
	}

	public void setPd_order(String pd_order) {
		this.pd_order = pd_order;
	}

	public String getPd_type() {
		return pd_type;
	}

	public void setPd_type(String pd_type) {
		this.pd_type = pd_type;
	}

	public int getPd_qty() {
		return pd_qty;
	}

	public void setPd_qty(int pd_qty) {
		this.pd_qty = pd_qty;
	}

	public String getPd_vendor() {
		return pd_vendor;
	}

	public void setPd_vendor(String pd_vendor) {
		this.pd_vendor = pd_vendor;
	}

	public Date getPd_date() {
		return pd_date;
	}

	public void setPd_date(Date pd_date) {
		this.pd_date = pd_date;
	}

	public Date getPd_ddate() {
		return pd_ddate;
	}

	public void setPd_ddate(Date pd_ddate) {
		this.pd_ddate = pd_ddate;
	}

	public String getPd_status() {
		return pd_status;
	}

	public void setPd_status(String pd_status) {
		this.pd_status = pd_status;
	}

	@Override
	public String toString() {
		return "Purchase_detModel [pd_id=" + pd_id + ", pd_order=" + pd_order
				+ ", pd_type=" + pd_type + ", pd_qty=" + pd_qty
				+ ", pd_vendor=" + pd_vendor 
				+ ", pd_date=" + pd_date
				+ ", pd_ddate=" + pd_ddate 
				+ ", pd_status=" + pd_status + "]";
	}

	
}
