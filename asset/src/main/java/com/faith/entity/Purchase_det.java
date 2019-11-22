package com.faith.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Purchase_details")
public class Purchase_det {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pd_id;

	@Column(name = "pd_order", nullable = false)
	private String pd_order;

	@Column(nullable=false)
	private String pd_type;

	@Column(name = "pd_qty", nullable = false)
	private int pd_qty;

	
	@Column(name = "pd_vendor", nullable = false)
	private String pd_vendor;

	@Column(name = "pd_date", nullable = false)
	private Date pd_date;

	
	private Date pd_ddate;

	@Column(name = "pd_status", nullable = false)
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
		return "Purchase_det [pd_id=" + pd_id + ", pd_order=" + pd_order
				+ ", pd_type=" + pd_type + ", pd_qty=" + pd_qty
				+ ", pd_vendor=" + pd_vendor + ", pd_date=" + pd_date
				+ ", pd_ddate=" + pd_ddate 
				+ ", pd_status=" + pd_status + "]";
	}
	

}
