package com.faith.dao;

import java.util.List;

import com.faith.entity.Assetdet;
import com.faith.entity.Purchase_det;


public interface Purchase_detDao {
	public List <Purchase_det> getAll();
	public void save(Purchase_det purchase);
	public void update(Purchase_det purchase);
	public void delete(int pd_id);
	public Purchase_det getById(int pd_id);

}
