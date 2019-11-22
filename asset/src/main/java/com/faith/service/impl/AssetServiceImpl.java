package com.faith.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.dao.AssetdetDao;
import com.faith.entity.Assetdet;
import com.faith.model.AssetdetModel;
import com.faith.service.AssetService;

@Service
@Transactional
public class AssetServiceImpl implements AssetService{

	@Autowired
	private AssetdetDao adao;
	
	@Override
	public AssetdetModel findById(int ad_id) {
		// TODO Auto-generated method stub
		return toModel(adao.getById(ad_id));
	}

	@Override
	public void saveAsset(AssetdetModel asset) {
		// TODO Auto-generated method stub
		Assetdet asset_dt = toEntity(asset);
		adao.save(asset_dt);
	}

	@Override
	public List<AssetdetModel> findAll() {
		// TODO Auto-generated method stub
		List<AssetdetModel> list = new ArrayList<AssetdetModel>();
    	List<Assetdet> assetlist = adao.getAll();
    	for(Assetdet asset:assetlist) {
    		list.add(toModel(asset));
    	}
		return list;
	}

	@Override
	public void updateAsset(AssetdetModel asset) {
		// TODO Auto-generated method stub
		adao.update(toEntity(asset));
	}

	@Override
	public void deleteById(int ad_id) {
		// TODO Auto-generated method stub
		adao.delete(ad_id);
	}
	
	private Assetdet toEntity(AssetdetModel asset_detModel){
		Assetdet asset_det=new Assetdet();
		asset_det.setAd_id(asset_detModel.getAd_id());
		asset_det.setAd_name(asset_detModel.getAd_name());
		asset_det.setAd_type(asset_detModel.getAd_type());
		asset_det.setAd_class(asset_detModel.getAd_class());
		return asset_det;
	}
	
	private AssetdetModel toModel(Assetdet asset_det){
		AssetdetModel asset_detModel=new AssetdetModel();
		asset_detModel.setAd_id(asset_det.getAd_id());
		asset_detModel.setAd_name(asset_det.getAd_name());
		asset_detModel.setAd_type(asset_det.getAd_type());
		asset_detModel.setAd_class(asset_det.getAd_class());
		return asset_detModel;
	}
	
	@Override
	public List<Assetdet> getDistinctService() {
		// TODO Auto-generated method stub
		List<AssetdetModel> list = new ArrayList<AssetdetModel>();
    	List<Assetdet> assetlist = adao.getDistinct();
    	System.out.println("**************************");
    	System.out.println(assetlist);
    	System.out.println("************************");
		
    	/*for(Assetdet asset:assetlist) {
    		System.out.println("forloop entered");
    		list.add(toModel(asset));
    	}*/
    	return assetlist;
	}

	@Override
	public List<Assetdet> getAdnameService() {
		// TODO Auto-generated method stub
		List<AssetdetModel> list = new ArrayList<AssetdetModel>();
    	List<Assetdet> assetlist = adao.getAdname();
    	return assetlist;
	}
	
}
