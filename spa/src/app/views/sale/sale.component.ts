import { Component, OnInit } from '@angular/core';
import { SaleService } from 'src/app/data/service/sale/sale.service';

@Component({
  selector: 'app-sale',
  templateUrl: './sale.component.html',
  styleUrls: ['./sale.component.css']
})
export class SaleComponent implements OnInit {

  public listClient = [];
  public listProducts = [];

  constructor(
    public productService: SaleService,
  ) { }

  ngOnInit(): void {
    this.getClients();
    this.getProducts();
  }


  getClients() {

    this.productService.get('client').subscribe(
      response => {

        console.log(response)
        this.listClient = response.objectResponse.map(element => {
          return {
            ...element,
            id: element.id,
            fullName : element.fullName,
          }
        })
   
      }
    );
  }

  getProducts() {

    this.productService.get('product').subscribe(
      response => {

        console.log(response)
        this.listProducts = response.objectResponse.map(element => {
          return {
            ...element,
            id: element.id,
            fullName : element.fullName,
          }
        })
   
      }
    );
  }
  Create(){

  }
}


