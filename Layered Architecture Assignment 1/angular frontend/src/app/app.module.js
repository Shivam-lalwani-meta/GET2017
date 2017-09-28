"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var forms_1 = require("@angular/forms");
var app_component_1 = require("./app.component");
var product_component_1 = require("./product.component");
var dashboard_component_1 = require("./dashboard.component");
var pipe_1 = require("./pipe");
var product_service_1 = require("./product.service");
var http_1 = require("@angular/http");
var contact_us_component_1 = require("./contact-us.component");
var add_product_1 = require("./add-product");
var Cart_1 = require("./Cart");
var cart_service_1 = require("./cart-service");
var product_detail_1 = require("./product-detail");
var product_detail_inwell_1 = require("./product-detail-inwell");
var app_routing_module_1 = require("./app-routing.module");
var show_product_detail_1 = require("./show-product-detail");
var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, forms_1.FormsModule, http_1.HttpModule, app_routing_module_1.AppRoutingModule],
        declarations: [app_component_1.AppComponent, product_component_1.Products, product_detail_1.ProductDetailComponent, product_detail_inwell_1.ProductDetailInWell, show_product_detail_1.ShowProductDetailComponent, Cart_1.Cart, dashboard_component_1.DashboardComponent, pipe_1.FilterPipe, contact_us_component_1.ContactUs, add_product_1.AddProduct],
        bootstrap: [app_component_1.AppComponent],
        providers: [product_service_1.ProductService, cart_service_1.CartService]
    })
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map