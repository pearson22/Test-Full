import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { environment } from 'src/environments/environment';
import { SaleModelForms } from '../../schema/sale/sale.model';

@Injectable({
  providedIn: 'root'
})
export class SaleService {

  public productForm: FormGroup = new SaleModelForms().FormSale();
  public api =  environment.api + environment.sale;
  constructor(private http: HttpClient) { }

  public get(url: string) {
    return this.http.get<any>(this.api + url);
  }

  public post(url: string, DATA: any) {
    return this.http.post(this.api + url, DATA);
  }

  public delete(url: string) {
    return this.http.delete(this.api + url);
  }

  public put(url: string, DATA: any) {
    return this.http.put(this.api + url, DATA);
  }
}
