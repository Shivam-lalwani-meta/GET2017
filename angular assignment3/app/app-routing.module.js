"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var dashboard_component_1 = require("./dashboard.component");
var product_component_1 = require("./product.component");
var product_detail_1 = require("./product-detail");
var contact_us_component_1 = require("./contact-us.component");
var add_product_1 = require("./add-product");
var show_product_detail_1 = require("./show-product-detail");
var Cart_1 = require("./Cart");
var routes = [
    { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
    { path: 'dashboard', component: dashboard_component_1.DashboardComponent },
    { path: 'detail/:id', component: product_detail_1.ProductDetailComponent },
    { path: 'showdetail/:id', component: show_product_detail_1.ShowProductDetailComponent },
    { path: 'products', component: product_component_1.Products },
    { path: 'contactus', component: contact_us_component_1.ContactUs },
    { path: 'addproduct', component: add_product_1.AddProduct },
    { path: 'cart', component: Cart_1.Cart }
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    return AppRoutingModule;
}());
AppRoutingModule = __decorate([
    core_1.NgModule({
        imports: [router_1.RouterModule.forRoot(routes)],
        exports: [router_1.RouterModule]
    })
], AppRoutingModule);
exports.AppRoutingModule = AppRoutingModule;
//# sourceMappingURL=app-routing.module.js.map