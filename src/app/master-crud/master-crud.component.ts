import { Component, OnInit } from '@angular/core';
import { AssetmasterService } from '../assetmaster.service';
import { Router } from '@angular/router';
import { AssetMaster } from '../assetmaster';

@Component({
  selector: 'app-master-crud',
  templateUrl: './master-crud.component.html',
  styleUrls: ['./master-crud.component.scss']
})
export class MasterCrudComponent implements OnInit {
  masterNew:AssetMaster[];
  masters:AssetMaster[];
  asset=new AssetMaster();

  constructor(private service:AssetmasterService,private router:Router) { }

  ngOnInit() {
    this.reset();
    this.getMaster();
    this.getVdtype();
    this.getAssetName();
  }

  getMaster():void{
    console.log("get assetmaster "+ this.asset.am_id);
     this.service.getById()
     .subscribe((response)=>{
       this.asset=response,
       console.log(response);
     },(error)=>{
       console.log(error);
     })
   } 

   addMaster():void{
    console.log(this.asset);
   this.service.insertMaster(this.asset)
   .subscribe((response)=>{
   console.log(response); 
   this.router.navigate(['/master']);  
   },(error)=>{
     console.log(error);
   })
 }

 cancel():void{
   this.router.navigate(['/master']);
 }



  getVdtype():void{
    this.service.getDistinct()
    .subscribe((response)=>{
      console.log(response);
      this.masters=response;
    },(error)=>{
      console.log(error);
    })
  }

  getAssetName():void{
    this.service.getAdName()
    .subscribe((response)=>{
      console.log(response);
      this.masterNew=response;
    },(error)=>{
      console.log(error);
    })
  }

  reset():void{
    console.log("reseting");
    this.asset.am_id=0;
    this.asset.am_type=null;
    this.asset.am_make=null;
    this.asset.am_snumber=null;
    this.asset.am_myear=null;
    this.asset.am_pdate=null;
    this.asset.am_warranty=null;
    this.asset.am_from=null;
    this.asset.am_to=null;
  }

}
