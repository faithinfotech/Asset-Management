package com.faith.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendor_details")
public class Vendordet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vd_id;

	
	@Column(name = "vd_name", nullable = false)
	private String vd_name;
	
	
	/*@ManyToOne
	@JoinColumn(name="ad_id")*/
	//private Assetdet asset;
	
	
	@Column(name="vd_type" ,nullable = false)
	private String vd_type;
	
	@Column(name = "vd_atype", nullable = false)
	private String vd_atype;

	@Column(name = "vd_from", nullable = false)
	private Date vd_from;

	@Column(name = "vd_to", nullable = false)
	private Date vd_to;

	@Column(name = "vd_addr", nullable = false)
	private String vd_addr;

	// getters and setters
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

	/*public Assetdet getAsset() {
		return asset;
	}

	public void setAsset(Assetdet asset) {
		this.asset = asset;
	}*/
	
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
		return "Vendordet [vd_id=" + vd_id + ", vd_name=" + vd_name
				+ ", vd_type=" + vd_type 
				+ ", vd_atype=" + vd_atype
				//+",asset="+asset
				+ ", vd_from=" + vd_from + ", vd_to=" + vd_to + ", vd_addr="
				+ vd_addr + "]";
	}

	

}
