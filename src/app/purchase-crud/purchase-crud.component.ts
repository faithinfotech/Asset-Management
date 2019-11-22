import { Component, OnInit } from '@angular/core';
import { PurchaseService } from '../purchase.service';
import { Router } from '@angular/router';
import { Purchase } from '../purchase';

@Component({
  selector: 'app-purchase-crud',
  templateUrl: './purchase-crud.component.html',
  styleUrls: ['./purchase-crud.component.scss']
})
export class PurchaseCrudComponent implements OnInit {
  crud:Purchase[];
  purchase:Purchase[];
  purchaseObj=new Purchase();
  
  constructor(private service:PurchaseService,private router:Router) { }

  ngOnInit() {
    this.reset();
    this.getPurchase();
    this.getVdtype();
    this.getVdName();
  }

  getPurchase():void{
    console.log("get purchase "+ this.purchaseObj.pd_id);
     this.service.getById()
     .subscribe((response)=>{
       this.purchaseObj=response,
       console.log(response);
     },(error)=>{
       console.log(error);
     })
   } 

   addPurchase():void{
    console.log(this.purchaseObj);
    if(this.purchaseObj.pd_status==='Consignment Recieved'){
      this.purchaseObj.pd_ddate=new Date();
    }
    else{
      this.purchaseObj.pd_ddate=null;
    }
   this.service.insertPurchase(this.purchaseObj)
   .subscribe((response)=>{
   this.router.navigate(['/purchase']);  
   },(error)=>{
     console.log(error);
   })
 }

 cancel():void{
   this.router.navigate(['/purchase']);
 }

  getVdtype():void{
    this.service.getDistinct()
    .subscribe((response)=>{
      console.log('purchase');
      console.log(response);

      this.purchase=response;
    },(error)=>{
      console.log(error);
    })
  }

  getVdName():void{
    this.service.getDistinctName()
    .subscribe((response)=>{
      console.log('crud');
      console.log(response);
 this.crud=response;
    },(error)=>{
      console.log(error);
    })
  }

  reset(){
    this.purchaseObj.pd_id=0;
    this.purchaseObj.pd_order=null;
    this.purchaseObj.pd_type=null;
    this.purchaseObj.pd_qty=null;
    this.purchaseObj.pd_vendor=null;
    this.purchaseObj.pd_date=null;
    //this.purchaseObj.pd_ddate=null;
    this.purchaseObj.pd_status=null;
  }

}
