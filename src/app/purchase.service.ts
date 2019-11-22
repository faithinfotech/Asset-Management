import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Purchase } from './purchase';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PurchaseService {

  am_id:number;
  status:string;
  pd_id:number;
  constructor(private httpService:HttpClient) { }

  edit(pd_id:number){
    this.pd_id=pd_id;
  }

  getAll():Observable<Purchase[]>{
    return this.httpService.get<Purchase[]>(environment.APIUrl+'purchase');
  }

  getById():Observable<Purchase>{
    return this.httpService.get<Purchase>(environment.APIUrl+'purchase/'+this.pd_id);
  }

  insertPurchase(purchase:Purchase)
  {
    let body = JSON.stringify(purchase);
    let headers = new HttpHeaders({'Content-Type': 'application/json'});
    let options = { headers: headers }
    console.log("before if loop "+purchase.pd_id);
    if(purchase.pd_id != 0)
    {
      console.log("edit service "+purchase.pd_id);
      return this.httpService.put(environment.APIUrl +'purchase',body,options);
    }
    else
    {
      console.log("insert service ");
      return this.httpService.post(environment.APIUrl +'purchase',body,options);
    }
   }

   deletePurchase(pd_id:number){
  
    return this.httpService.delete(environment.APIUrl +'purchase/'+ pd_id);
  }

  
  getDistinct():Observable<Purchase[]>{
    return this.httpService.get<Purchase[]>(environment.APIUrl+'asset/distinct');
  }

  getDistinctName():Observable<Purchase[]>{
    return this.httpService.get<Purchase[]>(environment.APIUrl+'vendor/distinct');
  }
}
