package com.faith.model;

import java.util.Date;

import com.faith.entity.Assetdet;

public class VendordetModel {

	private int vd_id;
	private String vd_name;
	private String vd_type;
	private String vd_atype;
	private Date vd_from;
	private Date vd_to;
	private String vd_addr;
	
	//getters and setters
	public int getVd_id() {
		return vd_id;
	}
	public void setVd_id(int vd_id) {
		this.vd_id = vd_id;
	}
	public String getVd_name() {
		return vd_name;
	}
	public void setVd_name(String vd_name) {
		this.vd_name = vd_name;
	}
	public String getVd_type() {
		return vd_type;
	}
	public void setVd_type(String vd_type) {
		this.vd_type = vd_type;
	}
	public String getVd_atype() {
		return vd_atype;
	}
	public void setVd_atype(String vd_atype) {
		this.vd_atype = vd_atype;
	}
	public Date getVd_from() {
		return vd_from;
	}
	public void setVd_from(Date vd_from) {
		this.vd_from = vd_from;
	}
	public Date getVd_to() {
		return vd_to;
	}
	public void setVd_to(Date vd_to) {
		this.vd_to = vd_to;
	}
	public String getVd_addr() {
		return vd_addr;
	}
	public void setVd_addr(String vd_addr) {
		this.vd_addr = vd_addr;
	}
	
	@Override
	public String toString() {
		return "VendordetModel [vd_id=" + vd_id + ", vd_name=" + vd_name
				+ ", vd_type=" + vd_type + ", vd_atype=" + vd_atype
				+ ", vd_from=" + vd_from + ", vd_to=" + vd_to + ", vd_addr="
				+ vd_addr + "]";
	}
	
	
	
}