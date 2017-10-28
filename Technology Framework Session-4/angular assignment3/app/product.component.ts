import { Component, OnInit } from '@angular/core';
import { Product } from './Product'
import { ProductService } from './product.service'
import { FilterPipe } from './pipe'
import { Router } from '@angular/router';
import { CartService } from './cart-service'

@Component({
  selector: 'my-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
})

export class Products implements OnInit {
  title = 'Tour of pro';
  prodArray: Product[];
  selectedProd: Product;
  cartArray: Product[];
  isToggle: boolean = false;

  constructor(private prodService: ProductService, private router: Router,  private cartObj: CartService) { }

  getProducts(): void {
    this.prodService.getProducts().then(prodArray => this.prodArray = prodArray);
  }

  ngOnInit(): void {
    this.getProducts();
  }

  gotoDetail(): void {
    this.router.navigate(['/detail', this.selectedProd.id]);
  }

  toggle(): void {
    this.isToggle = !this.isToggle;
  }

  onSelect(prod: Product): void {
    this.selectedProd = prod;
  }

  addToCart(prod: Product): void {
    console.log(prod.title);
    this.cartObj.addToCart(prod);
  }

  deleteUser(prod: Product): void {
    for (let i = 0; i < this.prodArray.length; i++) {
      if (this.prodArray[i] == prod) {
        this.prodArray.splice(i, 1);
      }
    }
  }

  delete(hero: Product): void {
    this.prodService
      .delete(hero.id)
      .then(() => {
        this.prodArray = this.prodArray.filter(h => h !== hero);
        if (this.selectedProd === hero) { this.selectedProd = null; }
      });
  }
  /*prod: Product = {
    title : 'Earphones',
    price: 499
  };*/
}

