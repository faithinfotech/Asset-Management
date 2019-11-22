import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { AssetComponent } from './asset/asset.component';
import { CrudComponent } from './crud/crud.component';
import { VendorComponent } from './vendor/vendor.component';
import { VendorCrudComponent } from './vendor-crud/vendor-crud.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { PurchaseCrudComponent } from './purchase-crud/purchase-crud.component';
import { AssetMasterComponent } from './asset-master/asset-master.component';
import { MasterCrudComponent } from './master-crud/master-crud.component';


const routes: Routes = [
  { path:'',component:LoginComponent},
  { path:'home', component:HomeComponent,canActivate:[AuthGuard]},
  { path:'asset', component:AssetComponent,canActivate:[AuthGuard]},
  { path:'crud',component:CrudComponent,canActivate:[AuthGuard]},
  { path:'vendor',component:VendorComponent,canActivate:[AuthGuard]},
  { path:'vendor-crud',component:VendorCrudComponent,canActivate:[AuthGuard]},
  { path:'purchase',component:PurchaseComponent,canActivate:[AuthGuard]},
  { path:'purchase-crud',component:PurchaseCrudComponent,canActivate:[AuthGuard]},
  { path:'master',component:AssetMasterComponent,canActivate:[AuthGuard]},
  { path:'master-crud',component:MasterCrudComponent,canActivate:[AuthGuard]}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
