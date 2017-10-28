import { Injectable } from '@angular/core'
import { Product } from './Product'
import { PRODARRAY } from './mock-products'

@Injectable()
export class ProductService {
    getProducts(): Promise<Product[]> {
        return Promise.resolve(PRODARRAY);
    }

    getHeroesSlowly(): Promise<Product[]> {
        return new Promise(resolve => {
          // Simulate server latency with 2 second delay
          setTimeout(() => resolve(this.getProducts()), 12000);
        });
      }
}