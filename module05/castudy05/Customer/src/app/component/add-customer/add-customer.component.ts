import { Component, OnInit } from '@angular/core';
import {CustomerModel} from '../../model/customer.model';
import {CustomerServiceService} from '../../Service/customer-service.service';
import {Subscription} from 'rxjs';
import {Router} from '@angular/router';


@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  public subscription: Subscription;
  public  customers: CustomerModel;
  constructor(public  customerService: CustomerServiceService, routerService: Router) { }

  ngOnInit(): void {
    this.customers = new CustomerModel();
  }

  addCustomer() {
    this.subscription = this.customerService.addCustomer(this.customers).subscribe(data => {
     console.log(data);
    });
  }
}
