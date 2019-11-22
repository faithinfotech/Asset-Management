package com.faith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faith.entity.Assetdet;
import com.faith.entity.Vendordet;
import com.faith.model.VendordetModel;
import com.faith.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	//to get all vendor details
	@RequestMapping(method=RequestMethod.GET)
	public List<VendordetModel> list(){
		return vendorService.findAll();		
	}
	
	//to get vendor details by vd_id
	@RequestMapping(value="/{vd_id}",method=RequestMethod.GET)
	public VendordetModel vendordetModel(@PathVariable("vd_id") int vd_id){
		return vendorService.findById(vd_id);
	}
	
	//to insert new vendor
	@RequestMapping(method=RequestMethod.POST)
	public VendordetModel createVendor(@RequestBody VendordetModel vendordetModel){
		System.out.println(vendordetModel);
		vendorService.saveVendor(vendordetModel);
		return vendordetModel;
	}
	
	//to update vendor details
	@RequestMapping(method=RequestMethod.PUT)
	public VendordetModel updateVendors(@RequestBody VendordetModel vendordetModel){
		vendorService.updateVendor(vendordetModel);
		return vendordetModel;
	}
	
	//to delete vendor details by using vd_id
	@RequestMapping(value="/{vd_id}",method=RequestMethod.DELETE)
	public VendordetModel deleteVendor(@PathVariable("vd_id") int vd_id){
		VendordetModel vendordetModel=vendorService.findById(vd_id);
		vendorService.deleteById(vendordetModel.getVd_id());
		return vendordetModel;
	}
	
	@RequestMapping(value="/distinct",method=RequestMethod.GET)
	public List<Vendordet> listDistinct(){
		return vendorService.getDistinctService();
	}
}
