import { Component, Input } from '@angular/core';
import { Products }  from './product.component';

@Component({
    selector:'prod-well',
    template: `
    <div class="well">
        <div *ngIf="selectedProd">
            <h2>{{selectedProd.title}} details!</h2>
            <div><label>price: </label>{{selectedProd.price}}</div>
            <div>
                <label>title: </label>
                <input [(ngModel)]="selectedProd.title" placeholder="title"/>
            </div>
         </div>
    </div> 
    `
})

export class ProductDetailInWell {
    @Input() prod:Products;
}