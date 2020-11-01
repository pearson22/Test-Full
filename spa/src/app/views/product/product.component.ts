import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/data/service/product/product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(
    public productService: ProductService,
  ) { }

  ngOnInit(): void {
  }

  Create() {
    let client = this.productService.productForm;
    if(client.valid){
      this.productService.post('product', client.value).subscribe(
        response => {
          client.reset();
        },
        error => {
        }
      );
    }
  }

}
