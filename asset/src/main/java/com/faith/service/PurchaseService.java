package com.faith.service;

import java.util.List;

import com.faith.model.Purchase_detModel;

public interface PurchaseService {
	Purchase_detModel findById(int pd_id);
	void savePurchase(Purchase_detModel purchase);	 
    List<Purchase_detModel> findAll(); 
    void updatePurchase(Purchase_detModel purchase);
	void deletePurchase(int pd_id);
}
