package com.faith.dao;

import java.util.List;

import com.faith.entity.Assetdet;

public interface AssetdetDao {
	public List <Assetdet> getAll();
	public void save(Assetdet asset);
	public void update(Assetdet asset);
	public void delete(int ad_id);
	public Assetdet getById(int ad_id);
	public List<Assetdet>getDistinct();
	public List<Assetdet>getAdname();
}
