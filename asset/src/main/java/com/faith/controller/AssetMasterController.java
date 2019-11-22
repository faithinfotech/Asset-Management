package com.faith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faith.model.Asset_masterModel;
import com.faith.model.AssetdetModel;
import com.faith.service.AssetMasterService;

@RestController
@RequestMapping("/assetmaster")
public class AssetMasterController {
	
	@Autowired
	private AssetMasterService assetMasterService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Asset_masterModel> list(){
		return assetMasterService.findAll();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Asset_masterModel master(@PathVariable("id") int am_id){
		return assetMasterService.findById(am_id);
	}

	@RequestMapping(method=RequestMethod.POST)
	public Asset_masterModel createMaster(@RequestBody Asset_masterModel asset_masterModel){
		System.out.println(asset_masterModel);
		assetMasterService.saveAsset(asset_masterModel);
		return asset_masterModel;
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Asset_masterModel updateAsset(@RequestBody Asset_masterModel asset_masterModel){
		assetMasterService.updateAsset(asset_masterModel);
		return asset_masterModel;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public Asset_masterModel deleteAsset(@PathVariable("id") int am_id){
		Asset_masterModel asset_masterModel=assetMasterService.findById(am_id);
		assetMasterService.deleteById(asset_masterModel.getAm_id());
		return asset_masterModel;
	}
	
	
}
