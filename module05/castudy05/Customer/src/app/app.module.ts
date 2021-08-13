import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {CustomerServiceService} from './Service/customer-service.service';
import { ListCustomerComponent } from './component/list-customer/list-customer.component';
import { EditCustomerComponent } from './component/edit-customer/edit-customer.component';
import { AddCustomerComponent } from './component/add-customer/add-customer.component';
import { CustomersComponent } from './component/customers/customers.component';
import { HomeComponent } from './component/home/home.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ListCustomerComponent,
    EditCustomerComponent,
    AddCustomerComponent,
    CustomersComponent,
    HomeComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
    ],
  providers: [
    CustomerServiceService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
