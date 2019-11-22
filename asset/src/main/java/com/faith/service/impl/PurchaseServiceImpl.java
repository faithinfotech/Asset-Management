package com.faith.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.dao.Purchase_detDao;
import com.faith.entity.Purchase_det;
import com.faith.model.Purchase_detModel;
import com.faith.service.PurchaseService;

@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private Purchase_detDao pdao;
	
	@Override
	public Purchase_detModel findById(int pd_id) {
		// TODO Auto-generated method stub
		return toModel(pdao.getById(pd_id));
	}

	@Override
	public void savePurchase(Purchase_detModel purchase) {
		// TODO Auto-generated method stub
		Purchase_det purchase_det = toEntity(purchase);
		System.out.println("@service:purchase_det "+purchase_det);
		System.out.println("@service:purchase"+purchase);
		pdao.save(purchase_det);
	}
		

	@Override
	public List<Purchase_detModel> findAll() {
		// TODO Auto-generated method stub
		List<Purchase_detModel> list = new ArrayList<Purchase_detModel>();
    	List<Purchase_det> purchaselist = pdao.getAll();
    	for(Purchase_det purchase:purchaselist) {
    		list.add(toModel(purchase));
    	}
	
		return list;
	}

	@Override
	public void updatePurchase(Purchase_detModel purchase) {
		// TODO Auto-generated method stub
		pdao.update(toEntity(purchase));
	}

	@Override
	public void deletePurchase(int pd_id) {
		// TODO Auto-generated method stub
		pdao.delete(pd_id);
	}
	
	private Purchase_det toEntity(Purchase_detModel purchase_detModel){
		Purchase_det purchase_det=new Purchase_det();
		purchase_det.setPd_id(purchase_detModel.getPd_id());
		purchase_det.setPd_order(purchase_detModel.getPd_order());
		purchase_det.setPd_type(purchase_detModel.getPd_type());
		purchase_det.setPd_qty(purchase_detModel.getPd_qty());
		purchase_det.setPd_vendor(purchase_detModel.getPd_vendor());
		purchase_det.setPd_date(purchase_detModel.getPd_date());
		purchase_det.setPd_ddate(purchase_detModel.getPd_ddate());
		purchase_det.setPd_status(purchase_detModel.getPd_status());
		return purchase_det;
	}
	
	private Purchase_detModel toModel(Purchase_det Purchase_det){
		Purchase_detModel Purchase_detModel=new Purchase_detModel();
		Purchase_detModel.setPd_id(Purchase_det.getPd_id());
		Purchase_detModel.setPd_order(Purchase_det.getPd_order());
		Purchase_detModel.setPd_type(Purchase_det.getPd_type());
		Purchase_detModel.setPd_qty(Purchase_det.getPd_qty());
		Purchase_detModel.setPd_vendor(Purchase_det.getPd_vendor());
		Purchase_detModel.setPd_date(Purchase_det.getPd_date());
		Purchase_detModel.setPd_ddate(Purchase_det.getPd_ddate());
		Purchase_detModel.setPd_status(Purchase_det.getPd_status());
		return Purchase_detModel;
	}


}
