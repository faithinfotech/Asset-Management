package com.faith.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.dao.VendordetDao;
import com.faith.entity.Assetdet;
import com.faith.entity.Vendordet;
import com.faith.model.AssetdetModel;
import com.faith.model.VendordetModel;
import com.faith.service.VendorService;
@Service
@Transactional
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendordetDao vdao;
	
	@Override
	public VendordetModel findById(int vd_id) {
		// TODO Auto-generated method stub
		return toModel(vdao.getById(vd_id));
	}

	@Override
	public void saveVendor(VendordetModel vendor) {
		// TODO Auto-generated method stub
		Vendordet vendor_dt = toEntity(vendor);
		System.out.println(vendor_dt);
		vdao.save(vendor_dt);
		
	}

	@Override
	public List<VendordetModel> findAll() {
		// TODO Auto-generated method stub
		List<VendordetModel> list = new ArrayList<VendordetModel>();
    	List<Vendordet> vendorlist = vdao.getAll();

    	System.out.println("**********************************************");
    	System.out.println(vendorlist);
    	System.out.println("**********************************************");
    	for(Vendordet vendor:vendorlist) {
    		list.add(toModel(vendor));
    	}
		return list;
	}
	

	@Override
	public void updateVendor(VendordetModel vendor) {
		// TODO Auto-generated method stub
		vdao.update(toEntity(vendor));
	}

	@Override
	public void deleteById(int vd_id) {
		// TODO Auto-generated method stub
		vdao.delete(vd_id);
	}
	
	private Vendordet toEntity(VendordetModel VendordetModel){
		Vendordet Vendordet=new Vendordet();
		Vendordet.setVd_id(VendordetModel.getVd_id());
		Vendordet.setVd_name(VendordetModel.getVd_name());
		Vendordet.setVd_type(VendordetModel.getVd_type());
		Vendordet.setVd_atype(VendordetModel.getVd_atype());
		Vendordet.setVd_from(VendordetModel.getVd_from());
		Vendordet.setVd_to(VendordetModel.getVd_to());
		Vendordet.setVd_addr(VendordetModel.getVd_addr());
		return Vendordet;
	}
	
	private VendordetModel toModel(Vendordet Vendordet){
		VendordetModel VendordetModel=new VendordetModel();
		VendordetModel.setVd_id(Vendordet.getVd_id());
		VendordetModel.setVd_name(Vendordet.getVd_name());
		VendordetModel.setVd_type(Vendordet.getVd_type());
		VendordetModel.setVd_atype(Vendordet.getVd_atype());
		VendordetModel.setVd_from(Vendordet.getVd_from());
		VendordetModel.setVd_to(Vendordet.getVd_to());
		VendordetModel.setVd_addr(Vendordet.getVd_addr());
		return VendordetModel;
	}

	@Override
	public List<Vendordet> getDistinctService() {
		// TODO Auto-generated method stub
		List<VendordetModel> list = new ArrayList<VendordetModel>();
    	List<Vendordet> vendorlist = vdao.getDistinct();
    	System.out.println("**************************");
    	System.out.println(vendorlist);
    	System.out.println("************************");
    	return vendorlist;
	}
	
}
