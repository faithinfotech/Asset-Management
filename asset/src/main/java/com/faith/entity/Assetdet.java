package com.faith.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "asset_details")
public class Assetdet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ad_id;

	@Column(nullable = false)
	private String ad_name;
	

	@Column(nullable = false)
	private String ad_type;
	
	
	@Column(nullable = false)
	private String ad_class;

	// getters and setters
	public int getAd_id() {
		return ad_id;
	}

	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}

	public String getAd_name() {
		return ad_name;
	}

	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}

	public String getAd_type() {
		return ad_type;
	}

	public void setAd_type(String ad_type) {
		this.ad_type = ad_type;
	}

	
	public String getAd_class() {
		return ad_class;
	}

	public void setAd_class(String ad_class) {
		this.ad_class = ad_class;
	}

	@Override
	public String toString() {
		return "Assetdet [ad_id=" + ad_id + ", ad_name=" + ad_name
				+ ", ad_type=" + ad_type
				+ ", ad_class=" + ad_class + "]";
	}
}
