import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { Products }  from './app.component';
import { ProductDetailComponent } from './product-detail'
import { ProductDetailInWell } from './product-detail-inwell'

@NgModule({
  imports:      [ BrowserModule, FormsModule ],
  declarations: [ Products, ProductDetailComponent, ProductDetailInWell ],
  bootstrap:    [ Products ]
})
export class AppModule { }
