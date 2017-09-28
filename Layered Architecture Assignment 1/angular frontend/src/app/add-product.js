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
var product_component_1 = require("./product.component");
var product_service_1 = require("./product.service");
var router_1 = require("@angular/router");
var common_1 = require("@angular/common");
var AddProduct = (function () {
    function AddProduct(prodService, router, prodComp, loc) {
        this.prodService = prodService;
        this.router = router;
        this.prodComp = prodComp;
        this.loc = loc;
    }
    AddProduct.prototype.add = function (name, price) {
        var _this = this;
        name = name.trim();
        if (!name) {
            return;
        }
        this.prodService.create(name, price)
            .then(function (prod) {
            _this.prodComp.prodArray.push(prod);
            _this.prodComp.selectedProd = null;
        });
        this.goBack();
    };
    AddProduct.prototype.goBack = function () {
        this.loc.back();
    };
    return AddProduct;
}());
AddProduct = __decorate([
    core_1.Component({
        selector: 'add-product',
        templateUrl: './addproduct.html',
        providers: [product_component_1.Products]
    }),
    __metadata("design:paramtypes", [product_service_1.ProductService, router_1.Router, product_component_1.Products, common_1.Location])
], AddProduct);
exports.AddProduct = AddProduct;
//# sourceMappingURL=add-product.js.map