package com.faith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faith.model.Purchase_detModel;
import com.faith.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	@Autowired
	private PurchaseService purchaseService;
	
	//to get all purchase details
	@RequestMapping(method=RequestMethod.GET)
	public List<Purchase_detModel> list(){
		return purchaseService.findAll();	
	}
	
	//to get purchase details by pd_id
	@RequestMapping(value="/{pd_id}",method=RequestMethod.GET)
	public Purchase_detModel purchase_detModel(@PathVariable("pd_id") int pd_id){
		return purchaseService.findById(pd_id);
	}
	
	//to create new purchase details
	@RequestMapping(method=RequestMethod.POST)
	public Purchase_detModel createPurchase(@RequestBody Purchase_detModel purchase_detModel){
		System.out.println("@controller :"+purchase_detModel);
		purchaseService.savePurchase(purchase_detModel);
		return purchase_detModel;
	}
	
	//to update purchase details
	@RequestMapping(method=RequestMethod.PUT)
	public Purchase_detModel updatePurchase(@RequestBody Purchase_detModel purchase_detModel){
		purchaseService.updatePurchase(purchase_detModel);
		return purchase_detModel;
	}
	
	//to delete purchase details by using pd_id
	@RequestMapping(value="/{pd_id}",method=RequestMethod.DELETE)
	public Purchase_detModel deletePurchase(@PathVariable("pd_id") int pd_id){
		Purchase_detModel purchase_detModel=purchaseService.findById(pd_id);
		purchaseService.deletePurchase(pd_id);
		return purchase_detModel;
	}
}
