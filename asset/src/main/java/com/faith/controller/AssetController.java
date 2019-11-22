package com.faith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faith.entity.Assetdet;
import com.faith.model.AssetdetModel;
import com.faith.service.AssetService;

@RestController
@RequestMapping("/asset")
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	//to find all asset details
	@RequestMapping(method=RequestMethod.GET)
	public List<AssetdetModel> list(){
		return assetService.findAll();
	}
	
	//to find asset by using ad_id
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public AssetdetModel asset(@PathVariable("id") int ad_id){
		return assetService.findById(ad_id);
	}
	
	//to insert a new asset details
	@RequestMapping(method=RequestMethod.POST)
	public AssetdetModel createAsset(@RequestBody AssetdetModel asset_detModel){
		System.out.println(asset_detModel);
		assetService.saveAsset(asset_detModel);
		return asset_detModel;
	}
	
	//to update asset details
	@RequestMapping(method=RequestMethod.PUT)
	public AssetdetModel updateAsset(@RequestBody AssetdetModel asset_detModel){
		assetService.updateAsset(asset_detModel);
		return asset_detModel;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public AssetdetModel deleteAsset(@PathVariable("id") int ad_id){
		AssetdetModel asset_detModel=assetService.findById(ad_id);
		assetService.deleteById(asset_detModel.getAd_id());
		return asset_detModel;
	}
	
	@RequestMapping(value="/distinct",method=RequestMethod.GET)
	public List<Assetdet> listDistinct(){
		return assetService.getDistinctService();
	}
	
	@RequestMapping(value="/adname",method=RequestMethod.GET)
	public List<Assetdet> listAdname(){
		return assetService.getAdnameService();
	}

}
