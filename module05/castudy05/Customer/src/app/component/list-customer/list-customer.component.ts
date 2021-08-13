import { Component, OnInit } from '@angular/core';
import {CustomerServiceService} from '../../Service/customer-service.service';
import {Subscription} from 'rxjs';
import {CustomerModel} from '../../model/customer.model';


@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
public subscription: Subscription;
  public  customers: CustomerModel[] = [];
    constructor(public  customerService: CustomerServiceService) { }

    ngOnInit(): void {
      this.subscription   = this.customerService.getAll().subscribe(data => {
        this.customers = data;
      });
  }
 deleteCustomers(id: number){
   this.subscription   = this.customerService.deleteCustomers(id).subscribe(data => {
                  console.log(data);
   });
 }

}
