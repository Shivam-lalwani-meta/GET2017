import 'rxjs/add/operator/switchMap';
import { Component, Input, OnInit } from '@angular/core';
import { Product } from './product';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Location } from '@angular/common';
import { ProductService } from './product.service'

@Component({
    selector: 'show-product-detail',
    templateUrl: './show-product-detail.html',
})
export class ShowProductDetailComponent implements OnInit {
    prod: Product;

    constructor(
        private prodService: ProductService,
        private route: ActivatedRoute,
        private location: Location
    ) { }

    ngOnInit(): void {
        this.route.paramMap
            .switchMap((params: ParamMap) => this.prodService.getProduct(+params.get('id')))
            .subscribe(prod => this.prod = prod);
    }
    
    save(): void {
        this.prodService.update(this.prod)
            .then(() => this.goBack());
    }

    goBack(): void {
        this.location.back();
    }
}