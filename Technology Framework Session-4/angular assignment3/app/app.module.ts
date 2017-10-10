import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { AppComponent }  from './app.component';
import { Products } from './product.component';
import { RouterModule }   from '@angular/router';
import { DashboardComponent } from './dashboard.component'
import { FilterPipe } from './pipe'
import { ProductService } from './product.service'
import { HttpModule }    from '@angular/http';
import { ContactUs } from './contact-us.component'
import { AddProduct } from './add-product'
import { Cart } from './Cart'

import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService }  from './in-memory-data.service';
import { CartService } from './cart-service'
import { ProductDetailComponent } from './product-detail'
import { ProductDetailInWell } from './product-detail-inwell'
import { AppRoutingModule }     from './app-routing.module';
import { ShowProductDetailComponent } from './show-product-detail'

@NgModule({
  imports:      [ BrowserModule, FormsModule, HttpModule,
    InMemoryWebApiModule.forRoot(InMemoryDataService), AppRoutingModule ], 
  declarations: [ AppComponent, Products , ProductDetailComponent, ProductDetailInWell, ShowProductDetailComponent, Cart,  DashboardComponent, FilterPipe, ContactUs, AddProduct],
  bootstrap:    [ AppComponent ],
  providers: [ProductService, CartService]
})
export class AppModule { }