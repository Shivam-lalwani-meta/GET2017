import { Component, OnInit } from '@angular/core';
import { CartService } from './cart-service';
import { Product } from './product';

@Component({
  selector: 'cart',
  templateUrl: './cart.html'
})

export class Cart implements OnInit {

  products: Product[];
  constructor(private cartServices: CartService) { }

  ngOnInit() {
    this.getCartProduct();
  }

  getCartProduct(): void {
    this.cartServices.getCartProducts().then(products => this.products = products);
  }

  deleteFromCart(prod : Product){
    for(let i = 0; i < this.products.length; i++){
      if(this.products[i] == prod) {
        this.products.splice(i , 1);
      }
    }
  }
}