package com.faith.service;

import java.util.List;

import com.faith.entity.Assetdet;
import com.faith.model.AssetdetModel;

public interface AssetService {
	AssetdetModel findById(int ad_id);
	void saveAsset(AssetdetModel asset);
	List<AssetdetModel>findAll();
	void updateAsset(AssetdetModel asset);
	void deleteById(int ad_id);
	List<Assetdet> getDistinctService();
	List<Assetdet> getAdnameService();

}
