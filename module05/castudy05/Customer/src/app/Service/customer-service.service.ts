import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {CustomerModel} from '../model/customer.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {
public  API = 'http://localhost:3000/customers';
  constructor(public  http: HttpClient) { }
  getAll(): Observable<CustomerModel[]>{
    // @ts-ignore
    return this.http.get(this.API);
  }

  addCustomer(customers: CustomerModel): Observable<CustomerModel>{
    // @ts-ignore
    return this.http.post(this.API, customers);
  }

  // @ts-ignore
  deleteCustomers(id: number): Observable<CustomerModel> {
    this.http.delete(`${this.API}/${id}`);

  }
}
