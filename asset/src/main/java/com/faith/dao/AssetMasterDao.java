package com.faith.dao;

import java.util.List;

import com.faith.entity.AssetMaster;


public interface AssetMasterDao {
	public List <AssetMaster> getAll();
	public void save(AssetMaster master);
	public void update(AssetMaster master);
	public void delete(int am_id);
	public AssetMaster getById(int am_id);
	
}
