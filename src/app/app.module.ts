import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule,ReactiveFormsModule} from '@angular/forms';
import{HttpClientModule} from '@angular/common/http';
import{ConfirmationPopoverModule} from 'angular-confirmation-popover';
import{NgxPaginationModule} from 'ngx-pagination';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { LoginService } from './login.service';
import { AuthGuard } from './auth.guard';
import { AssetComponent } from './asset/asset.component';
import { CrudComponent } from './crud/crud.component';
import { VendorComponent } from './vendor/vendor.component';
import { VendorCrudComponent } from './vendor-crud/vendor-crud.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { PurchaseCrudComponent } from './purchase-crud/purchase-crud.component';
import { AssetMasterComponent } from './asset-master/asset-master.component';
import { MasterCrudComponent } from './master-crud/master-crud.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    AssetComponent,
    CrudComponent,
    VendorComponent,
    VendorCrudComponent,
    PurchaseComponent,
    PurchaseCrudComponent,
    AssetMasterComponent,
    MasterCrudComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    ConfirmationPopoverModule.forRoot({
      confirmButtonType: 'danger' // set defaults here
    }),
    NgxPaginationModule,
    AppRoutingModule
  ],
  providers: [LoginService,AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
