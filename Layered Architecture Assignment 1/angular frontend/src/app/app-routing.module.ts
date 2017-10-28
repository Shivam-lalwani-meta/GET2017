import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent }   from './dashboard.component';
import { Products }      from './product.component';
import { ProductDetailComponent } from './product-detail'
import { ContactUs } from './contact-us.component'
import { AddProduct } from './add-product'
import { ShowProductDetailComponent } from './show-product-detail'
import { Cart } from './Cart'

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard',  component: DashboardComponent },
  { path: 'detail/:id', component: ProductDetailComponent },
  { path: 'showdetail/:id', component: ShowProductDetailComponent },
  { path: 'products',     component: Products },
  { path: 'contactus',     component: ContactUs },
  { path: 'addproduct',     component: AddProduct },
  { path: 'cart',     component: Cart }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
