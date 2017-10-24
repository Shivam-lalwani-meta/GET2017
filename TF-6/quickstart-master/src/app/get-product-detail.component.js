"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var common_1 = require("@angular/common");
var product_service_1 = require("./product.service");
var cart_service_1 = require("./cart-service");
var login_service_service_1 = require("./login-service.service");
var GetProductDetailComponent = (function () {
    function GetProductDetailComponent(productService, route, location, cartService, login) {
        this.productService = productService;
        this.route = route;
        this.location = location;
        this.cartService = cartService;
        this.login = login;
    }
    GetProductDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.route.paramMap
            .switchMap(function (params) { return _this.productService.getProduct(+params.get('id')); })
            .subscribe(function (product) { return _this.product = product; });
    };
    GetProductDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    GetProductDetailComponent.prototype.addToCart = function (product) {
        console.log(product);
        var cartItem = {
            pname: product.name,
            price: product.price,
            productId: product.id,
            userId: this.login.getUsername(),
            quantity: 1
        };
        console.log(this.login.getUsername() + "in product-component");
        this.cartService.addToCart(cartItem);
        alert("item added successfully");
    };
    return GetProductDetailComponent;
}());
GetProductDetailComponent = __decorate([
    core_1.Component({
        selector: 'my-get-product-detail',
        templateUrl: './get-product-detail.component.html',
        styleUrls: ['./get-product-detail.component.css']
    }),
    __metadata("design:paramtypes", [product_service_1.ProductService,
        router_1.ActivatedRoute,
        common_1.Location,
        cart_service_1.CartService,
        login_service_service_1.LoginService])
], GetProductDetailComponent);
exports.GetProductDetailComponent = GetProductDetailComponent;
//# sourceMappingURL=get-product-detail.component.js.map