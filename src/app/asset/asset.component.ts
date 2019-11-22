import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Asset } from '../asset';
import { AssetService } from '../asset.service';

@Component({
  selector: 'app-asset',
  templateUrl: './asset.component.html',
  styleUrls: ['./asset.component.scss']
})
export class AssetComponent implements OnInit {
  public popoverTitle: string = 'Delete';
  public popoverMessage: string = 'Do you want to delete ?';
  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;

  asset:Asset[];
  assetObject=new Asset();

  constructor(private router:Router,private service:AssetService) { }

  ngOnInit() {
    this.viewAsset();
  }

  viewAsset():void{
    this.service.getAll()
    .subscribe((response)=>{
    this.asset=response,
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }  

  delete(ad_id:number){
    this.service.deleteAsset(ad_id)
    .subscribe((response)=>{
    this.viewAsset();
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }

  addAsset():void{
   this.reset();
   this.service.ad_id = 0;
   this.router.navigate(['/crud']);
  
  }

  reset():void{
    console.log("reseting");
    this.assetObject.ad_id=0;
    this.assetObject.ad_name=null;
    this.assetObject.ad_type=null;
    this.assetObject.ad_class=null;
  }

  editAsset(ad_id:number){
    console.log("Before passing "+ad_id);
    
    this.service.edit(ad_id);
    this.router.navigate(['/crud']);
  }

  logout():void{
    localStorage.removeItem('text');
    this.router.navigate(['']);
  }

  back():void{
    this.router.navigate(['/home']);
  }

 
}