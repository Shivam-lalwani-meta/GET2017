import { Component, Input } from '@angular/core';
import { Products }  from './app.component';

@Component({
    selector:'prod-well',
    template: `
    <div class="well">
        <div *ngIf="prod">
            <h2>{{prod.title}} details!</h2>
            <div><label>price: </label>{{prod.price}}</div>
            <div>
                <label>title: </label>
                <input [(ngModel)]="prod.title" placeholder="title"/>
            </div>
         </div>
    </div> 
    `
})

export class ProductDetailInWell {
    @Input() prod:Products;
}