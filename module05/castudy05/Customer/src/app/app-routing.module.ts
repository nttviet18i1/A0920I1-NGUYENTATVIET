import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {ListCustomerComponent} from './component/list-customer/list-customer.component';
import {EditCustomerComponent} from './component/edit-customer/edit-customer.component';
import {CustomersComponent} from './component/customers/customers.component';
import {AddCustomerComponent} from './component/add-customer/add-customer.component';
import {HomeComponent} from './component/home/home.component';


const routes: Routes = [
  {
    path: '',
    component : HomeComponent

  },
  {
    path: 'customers',
    component :  CustomersComponent,
    children: [
      {
        path: '',
        component: ListCustomerComponent
      },
      {
        path: 'edit',
        component: EditCustomerComponent,
      },
      {
        path: 'add',
        component: AddCustomerComponent
      }
    ]

  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
