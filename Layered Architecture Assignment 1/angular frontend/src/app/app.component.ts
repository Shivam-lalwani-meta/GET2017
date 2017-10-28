import { Component } from '@angular/core';
import { Products } from './product.component'
import { FilterPipe } from './pipe'

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Shopping Cart';
  search="shivam";
}
