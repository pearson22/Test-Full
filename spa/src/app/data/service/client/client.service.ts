import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { environment } from 'src/environments/environment';
import { ClientModelForms } from '../../schema/client/client.model';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  public clientForm: FormGroup = new ClientModelForms().FormClient();
  public api =  environment.api + environment.client;
  
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
