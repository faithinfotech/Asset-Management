import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { VendorServiceService } from '../vendor-service.service';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-vendor',
  templateUrl: './vendor.component.html',
  styleUrls: ['./vendor.component.scss']
})
export class VendorComponent implements OnInit {
  vendor:Vendor[];
  ven=new Vendor();
  public popoverTitle: string = 'Delete';
  public popoverMessage: string = 'Do you want to delete ?';
  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;
  constructor(private service:VendorServiceService,private router:Router) { }

  ngOnInit() {
    this.viewVendor();
  }
back(){
  this.router.navigate(['/home']);
}

  viewVendor():void{
    this.service.getAll()
    .subscribe((response)=>{
    this.vendor=response,
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }  

  delete(vd_id:number){
    this.service.deleteVendor(vd_id)
    .subscribe((response)=>{
    this.viewVendor();
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }


  add():void{
    this.reset();
    this.service.vd_id=0;
    console.log("vendor html--add()"+this.service.vd_id);
    this.router.navigate(['/vendor-crud']);
  }

  editVendor(vd_id:number){
    
    console.log("Before passing "+vd_id);
    this.service.edit(vd_id);
    console.log("editvendor: "+ this.service.edit(vd_id))
    this.router.navigate(['/vendor-crud']);
  }



 reset():void{
    console.log("reseting");
    this.ven.vd_id=0;
    this.ven.vd_name=null;
    this.ven.vd_type=null;
    this.ven.vd_atype=null;
    this.ven.vd_from=null;
    this.ven.vd_to=null;
    this.ven.vd_addr=null;
  }

  
  logout():void{
    localStorage.removeItem('text');
    this.router.navigate(['']);
  }

}
