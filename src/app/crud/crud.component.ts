import { Component, OnInit } from '@angular/core';
import { AssetService } from '../asset.service';
import { Router } from '@angular/router';
import { Asset } from '../asset';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.scss']
})
export class CrudComponent implements OnInit {
  asset:Asset[];
  assetObject=new Asset();


  constructor(private service:AssetService,private router:Router) { }

  ngOnInit() {
    this.reset();
    this.getAsset();
  }
  
  getAsset():void{
    console.log("get asset "+ this.assetObject.ad_id);
     this.service.getById()
     .subscribe((response)=>{
       this.assetObject=response,
       console.log(response);
     },(error)=>{
       console.log(error);
     })
  
   } 
  add():void{
    this.service.insertAsset(this.assetObject)
    .subscribe((response)=>{
    console.log(response); 
    this.router.navigate(['/asset']);
   
    },(error)=>{
      console.log(error);
    })
  }
  
  
  cancel():void{
    this.router.navigate(['/asset']);
  }
  
  reset():void{
    this.assetObject.ad_id=0;
    this.assetObject.ad_name=null;
    this.assetObject.ad_type=null;
    this.assetObject.ad_class=null;
   
  }


}
