
import { Component, OnInit } from '@angular/core';

import { Product } from './Product'

import { ProductService } from './product.service'
@Component({
    selector: 'my-dash',
   
    templateUrl: './dashboard.component.html',
    styleUrls:['./dashboard.component.css'],
    providers:[ProductService]
})

export class DashboardComponent implements OnInit{
    prodArray: Product[];

    constructor(private productService:ProductService) {}
    
    ngOnInit(): void {
    this.productService.getProducts()
      .then(prodArray => this.prodArray = prodArray.slice(1, 5));
  }
}