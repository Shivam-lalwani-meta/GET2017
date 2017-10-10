import { Component, OnInit } from '@angular/core'
import { Products } from './product.component'
import { Product } from './Product'
import { ProductService } from './product.service'
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
    selector: 'add-product',
    templateUrl: './addproduct.html',
    providers: [Products]
})

export class AddProduct {

    constructor(private prodService: ProductService, private router: Router, private prodComp: Products, private loc: Location) { }

    add(name: string, price: number): void {
        name = name.trim();
        if (!name) { return; }
        this.prodService.create(name, price)
            .then(prod => {
                this.prodComp.prodArray.push(prod);
                this.prodComp.selectedProd = null;
            });
        this.goBack();
    }
    goBack(): void {
        this.loc.back();
    }
}