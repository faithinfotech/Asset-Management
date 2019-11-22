import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Asset } from './asset';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class AssetService {
  ad_id:number;

  constructor(private _httpService:HttpClient) { }

  getAll():Observable<Asset[]>{
    return this._httpService.get<Asset[]>(environment.APIUrl+'asset');
  }

  getById():Observable<Asset>{
    return this._httpService.get<Asset>(environment.APIUrl+'asset/'+this.ad_id);
  }

  insertAsset(asset:Asset)
  {
    let body = JSON.stringify(asset);
    let headers = new HttpHeaders({'Content-Type': 'application/json'});
    let options = { headers: headers }
    console.log("before if loop "+asset.ad_id);
    if(asset.ad_id != 0)
    {
      console.log("edit service "+asset.ad_id);
      return this._httpService.put(environment.APIUrl +'asset',body,options);
      
    }
    else
    {
      console.log("insert service ");
      return this._httpService.post(environment.APIUrl +'asset',body,options);
    }
   }

   edit(ad_id:number){
    this.ad_id=ad_id;
  }

   deleteAsset(ad_id:number){
  
    return this._httpService.delete(environment.APIUrl +'asset/'+ ad_id);
  }
   
     
   }


