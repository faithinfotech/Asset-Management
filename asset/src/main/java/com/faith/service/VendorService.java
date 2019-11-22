package com.faith.service;

import java.util.List;

import com.faith.entity.Assetdet;
import com.faith.entity.Vendordet;
import com.faith.model.VendordetModel;

public interface VendorService {
	VendordetModel findById(int vd_id);
	void saveVendor(VendordetModel vendor);	 
    List<VendordetModel> findAll(); 
    void updateVendor(VendordetModel vendor);
	void deleteById(int vd_id);
	List<Vendordet> getDistinctService();
}
