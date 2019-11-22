import { Component, OnInit } from '@angular/core';
import { VendorServiceService } from '../vendor-service.service';
import { Router } from '@angular/router';
import { Vendor } from '../vendor';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-vendor-crud',
  templateUrl: './vendor-crud.component.html',
  styleUrls: ['./vendor-crud.component.scss']
})
export class VendorCrudComponent implements OnInit {
  vendor:Vendor[];
  ven=new Vendor();

  constructor(private service:VendorServiceService,private router:Router) {}

  ngOnInit() {
    this.reset();
    this.getVendor();
    this.getVdtype();
  }

  getVendor():void{
    console.log("get asset "+ this.ven.vd_id);
     this.service.getById()
     .subscribe((response)=>{
       this.ven=response,
       console.log(response);
     },(error)=>{
       console.log(error);
     })
   } 

   addVendor():void{
     console.log(this.ven);
    this.service.insertVendor(this.ven)
    .subscribe((response)=>{
    console.log(response); 
    this.router.navigate(['/vendor']);  
    },(error)=>{
      console.log(error);
    })
  }

  cancel():void{
    this.router.navigate(['/vendor']);
  }

  getVdtype():void{
    this.service.getDistinct()
    .subscribe((response)=>{
      console.log(response);
      this.vendor=response;
    },(error)=>{
      console.log(error);
    })
  }

  reset():void{
    this.ven.vd_id=0;
    this.ven.vd_name=null;
    this.ven.vd_type=null;
    this.ven.vd_atype=null;
    this.ven.vd_from=null;
    this.ven.vd_to=null;
    this.ven.vd_addr=null;
   
  }
}
