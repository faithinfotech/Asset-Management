package com.faith.service;

import java.util.List;
import com.faith.model.Asset_masterModel;


public interface AssetMasterService {
	Asset_masterModel findById(int am_id);
	void saveAsset(Asset_masterModel master);
	List<Asset_masterModel>findAll();
	void updateAsset(Asset_masterModel master);
	void deleteById(int am_id);

}
