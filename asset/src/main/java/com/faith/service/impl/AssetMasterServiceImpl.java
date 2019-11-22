package com.faith.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.dao.AssetMasterDao;
import com.faith.entity.AssetMaster;
import com.faith.entity.AssetMaster;
import com.faith.entity.Assetdet;
import com.faith.model.Asset_masterModel;
import com.faith.service.AssetMasterService;

@Service
@Transactional
public class AssetMasterServiceImpl implements AssetMasterService {

	@Autowired
	private AssetMasterDao amdao;
	
	@Override
	public Asset_masterModel findById(int am_id) {
		// TODO Auto-generated method stub
		return toModel(amdao.getById(am_id));
	}

	@Override
	public void saveAsset(Asset_masterModel master) {
		// TODO Auto-generated method stub
		AssetMaster assetMaster = toEntity(master);
		amdao.save(assetMaster);
	}

	@Override
	public List<Asset_masterModel> findAll() {
		// TODO Auto-generated method stub
		List<Asset_masterModel> list = new ArrayList<Asset_masterModel>();
    	List<AssetMaster> masterlist = amdao.getAll();
    	for(AssetMaster master:masterlist) {
    		list.add(toModel(master));
    	}
		return list;
	}

	@Override
	public void updateAsset(Asset_masterModel master) {
		// TODO Auto-generated method stub
		amdao.update(toEntity(master));
	}

	@Override
	public void deleteById(int am_id) {
		// TODO Auto-generated method stub
		amdao.delete(am_id);
	}
	
	private AssetMaster toEntity(Asset_masterModel master) {
		// TODO Auto-generated method stub
		AssetMaster asset=new AssetMaster();
		asset.setAm_id(master.getAm_id());
		asset.setAm_type(master.getAm_type());
		asset.setAm_make(master.getAm_make());
		asset.setAm_model(master.getAm_model());
		asset.setAm_snumber(master.getAm_snumber());
		asset.setAm_myear(master.getAm_myear());
		asset.setAm_pdate(master.getAm_pdate());
		asset.setAm_warranty(master.getAm_warranty());
		asset.setAm_from(master.getAm_from());
		asset.setAm_to(master.getAm_to());
		asset.setStatus(master.getStatus());
		return asset;
	}


	private Asset_masterModel toModel(AssetMaster assetMaster) {
		// TODO Auto-generated method stub
		Asset_masterModel model=new Asset_masterModel();
		model.setAm_id(assetMaster.getAm_id());
		model.setAm_type(assetMaster.getAm_type());
		model.setAm_make(assetMaster.getAm_make());
		model.setAm_model(assetMaster.getAm_model());
		model.setAm_snumber(assetMaster.getAm_snumber());
		model.setAm_myear(assetMaster.getAm_myear());
		model.setAm_pdate(assetMaster.getAm_pdate());
		model.setAm_warranty(assetMaster.getAm_warranty());
		model.setAm_from(assetMaster.getAm_from());
		model.setAm_to(assetMaster.getAm_to());
		model.setStatus(assetMaster.getStatus());
		
		return model;
	}


}
