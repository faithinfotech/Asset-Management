import { Component, OnInit } from '@angular/core';
import { PurchaseService } from '../purchase.service';
import { Route, Router } from '@angular/router';
import { Purchase } from '../purchase';

@Component({
  selector: 'app-purchase',
  templateUrl: './purchase.component.html',
  styleUrls: ['./purchase.component.scss']
})
export class PurchaseComponent implements OnInit {
 
  purchase: Purchase[];
  purchaseObj = new Purchase();

  public popoverTitle: string = 'Delete';
  public popoverMessage: string = 'Do you want to delete ?';
  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;

  constructor(private service: PurchaseService, private router: Router) { }

  ngOnInit() {
    this.getView();
  }

  getView():void{
    this.service.getAll()
    .subscribe((response)=>{
      console.log(response);
      this.purchase=response;
    },(error)=>{
      console.log(error);
    })
  }

  delete(pd_id:number){
    this.service.deletePurchase(pd_id)
    .subscribe((response)=>{
      this.getView();
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }

  editPurchase(pd_id:number){
    console.log("Before passing "+pd_id);  
    this.service.edit(pd_id);
    this.router.navigate(['/purchase-crud']);
  }

  add():void{
    this.reset();
    this.service.pd_id = 0;
    this.router.navigate(['/purchase-crud']);
   }
 
   reset():void{
    console.log("reseting");
    this.purchaseObj.pd_id=0;
    this.purchaseObj.pd_order=null;
    this.purchaseObj.pd_type=null;
    this.purchaseObj.pd_qty=0;
    this.purchaseObj.pd_vendor=null;
    this.purchaseObj.pd_date=null;
    //this.purchaseObj.pd_ddate=null;
    this.purchaseObj.pd_status=null;
  }


  back(){
    this.router.navigateByUrl('/home');
  }

  logout():void{
    localStorage.removeItem('text');
    this.router.navigate(['']);
  }

  assetmaster():void{

    this.service.am_id=0;
    this.service.status="Asset Details registered internally";
    this.router.navigateByUrl('/master-crud');
 }

}
