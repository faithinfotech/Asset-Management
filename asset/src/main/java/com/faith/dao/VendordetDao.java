package com.faith.dao;

import java.util.List;

import com.faith.entity.Assetdet;
import com.faith.entity.Vendordet;

public interface VendordetDao {
	public List<Vendordet> getAll();
	public void save(Vendordet vendor);
	public void update(Vendordet vendor);
	public void delete(int vd_id);
	public Vendordet getById(int vd_id);
	public List<Vendordet>getDistinct();
}
