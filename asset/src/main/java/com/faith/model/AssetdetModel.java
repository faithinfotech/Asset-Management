package com.faith.model;

public class AssetdetModel {

	// instantiating variables
	private int ad_id;
	private String ad_name;
	private String ad_type;
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
		return "AssetdetModel [ad_id=" + ad_id + ", ad_name=" + ad_name
				+ ", ad_type=" + ad_type + ", ad_class=" + ad_class + "]";
	}
	
	

}
