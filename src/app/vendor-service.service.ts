import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Vendor } from './vendor';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VendorServiceService {

  vd_id:number;
  constructor(private httpService:HttpClient) { }
  getAll():Observable<Vendor[]>{
    console.log("getall vendor");
    return this.httpService.get<Vendor[]>(environment.APIUrl+'vendor');
  }

  getById():Observable<Vendor>{
    return this.httpService.get<Vendor>(environment.APIUrl+'vendor/'+this.vd_id);
  }

  insertVendor(vendor:Vendor)
  {
    let body = JSON.stringify(vendor);
    let headers = new HttpHeaders({'Content-Type': 'application/json'});
    let options = { headers: headers }
    console.log("before if loop "+vendor.vd_id);
    if(vendor.vd_id != 0 )
    {
      console.log("edit service "+vendor.vd_id);
      return this.httpService.put(environment.APIUrl +'vendor',body,options);
      
    }
    else
    {
      console.log("insert service ");
      console.log(vendor);
      return this.httpService.post(environment.APIUrl +'vendor',body,options);
    }
   }

   edit(vd_id:number){
    this.vd_id=vd_id;
  }

   deleteVendor(vd_id:number){
    return this.httpService.delete(environment.APIUrl +'vendor/'+ vd_id);
  }
   
  getDistinct():Observable<Vendor[]>{
    return this.httpService.get<Vendor[]>(environment.APIUrl+'asset/distinct');
  }
    

}

