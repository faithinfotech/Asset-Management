import { Component, OnInit } from '@angular/core';
import { AssetMaster } from '../assetmaster';
import { Router } from '@angular/router';
import { AssetmasterService } from '../assetmaster.service';

@Component({
  selector: 'app-asset-master',
  templateUrl: './asset-master.component.html',
  styleUrls: ['./asset-master.component.scss']
})
export class AssetMasterComponent implements OnInit {
masters:AssetMaster[];
asset=new AssetMaster();

public popoverTitle: string = 'Delete';
public popoverMessage: string = 'Do you want to delete ?';
public confirmClicked: boolean = false;
public cancelClicked: boolean = false;

  constructor(private router:Router,private service:AssetmasterService ) { }

  ngOnInit() {
    this.viewMaster();
  }

  viewMaster():void{
    this.service.getAll()
    .subscribe((response)=>{
    this.masters=response,
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }  

  delete(am_id:number){
    this.service.deleteMaster(am_id)
    .subscribe((response)=>{
    this.viewMaster();
      console.log(response);
    },(error)=>{
      console.log(error);
    })
  }

  addMaster():void{
    this.reset();
    this.service.am_id = 0;
    this.router.navigate(['/master-crud']);
   
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
 
   editMaster(am_id:number){
     console.log("Before passing "+am_id);
     
     this.service.edit(am_id);
     this.router.navigate(['/master-crud']);
   }
 
   logout():void{
     localStorage.removeItem('text');
     this.router.navigate(['']);
   }
 
   back():void{
     this.router.navigate(['/home']);
   }

}
