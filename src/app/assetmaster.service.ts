import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AssetMaster } from './assetmaster';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AssetmasterService {
am_id:number;

  constructor(private httpService:HttpClient) { }

  getAll():Observable<AssetMaster[]>{
    return this.httpService.get<AssetMaster[]>(environment.APIUrl+'assetmaster');
  }

  getById():Observable<AssetMaster>{
    return this.httpService.get<AssetMaster>(environment.APIUrl+'assetmaster/'+this.am_id);
  }

  insertMaster(master:AssetMaster)
  {
    let body = JSON.stringify(master);
    let headers = new HttpHeaders({'Content-Type': 'application/json'});
    let options = { headers: headers }
    console.log("before if loop "+master.am_id);
    if(master.am_id != 0)
    {
      console.log("edit service "+master.am_id);
      return this.httpService.put(environment.APIUrl +'assetmaster',body,options);
      
    }
    else
    {
      console.log("insert service ");
      return this.httpService.post(environment.APIUrl +'assetmaster',body,options);
    }
   }

   edit(am_id:number){
    this.am_id=am_id;
  }

   deleteMaster(am_id:number){
    return this.httpService.delete(environment.APIUrl +'assetmaster/'+ am_id);
  }

  getDistinct():Observable<AssetMaster[]>{
    return this.httpService.get<AssetMaster[]>(environment.APIUrl+'asset/distinct');
  }

  getAdName():Observable<AssetMaster[]>{
    return this.httpService.get<AssetMaster[]>(environment.APIUrl+'asset/adname');
  }
}
