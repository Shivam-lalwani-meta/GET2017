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
var product_service_1 = require("./product.service");
var router_1 = require("@angular/router");
var cart_service_1 = require("./cart-service");
var Products = (function () {
    function Products(prodService, router, cartObj) {
        this.prodService = prodService;
        this.router = router;
        this.cartObj = cartObj;
        this.title = 'Tour of pro';
        this.isToggle = false;
    }
    Products.prototype.getProducts = function () {
        var _this = this;
        this.prodService.getProducts().then(function (prodArray) { return _this.prodArray = prodArray; });
    };
    Products.prototype.ngOnInit = function () {
        this.getProducts();
    };
    Products.prototype.gotoDetail = function () {
        this.router.navigate(['/detail', this.selectedProd.id]);
    };
    Products.prototype.toggle = function () {
        this.isToggle = !this.isToggle;
    };
    Products.prototype.onSelect = function (prod) {
        this.selectedProd = prod;
    };
    Products.prototype.addToCart = function (prod) {
        console.log(prod.title);
        this.cartObj.addToCart(prod);
    };
    Products.prototype.deleteUser = function (prod) {
        for (var i = 0; i < this.prodArray.length; i++) {
            if (this.prodArray[i] == prod) {
                this.prodArray.splice(i, 1);
            }
        }
    };
    Products.prototype.delete = function (hero) {
        var _this = this;
        this.prodService
            .delete(hero.id)
            .then(function () {
            _this.prodArray = _this.prodArray.filter(function (h) { return h !== hero; });
            if (_this.selectedProd === hero) {
                _this.selectedProd = null;
            }
        });
    };
    return Products;
}());
Products = __decorate([
    core_1.Component({
        selector: 'my-product',
        templateUrl: './product.component.html',
        styleUrls: ['./product.component.css'],
    }),
    __metadata("design:paramtypes", [product_service_1.ProductService, router_1.Router, cart_service_1.CartService])
], Products);
exports.Products = Products;
//# sourceMappingURL=product.component.js.map