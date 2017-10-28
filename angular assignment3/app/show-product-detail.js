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
require("rxjs/add/operator/switchMap");
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var common_1 = require("@angular/common");
var product_service_1 = require("./product.service");
var ShowProductDetailComponent = (function () {
    function ShowProductDetailComponent(prodService, route, location) {
        this.prodService = prodService;
        this.route = route;
        this.location = location;
    }
    ShowProductDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.route.paramMap
            .switchMap(function (params) { return _this.prodService.getProduct(+params.get('id')); })
            .subscribe(function (prod) { return _this.prod = prod; });
    };
    ShowProductDetailComponent.prototype.save = function () {
        var _this = this;
        this.prodService.update(this.prod)
            .then(function () { return _this.goBack(); });
    };
    ShowProductDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    return ShowProductDetailComponent;
}());
ShowProductDetailComponent = __decorate([
    core_1.Component({
        selector: 'show-product-detail',
        templateUrl: './show-product-detail.html',
    }),
    __metadata("design:paramtypes", [product_service_1.ProductService,
        router_1.ActivatedRoute,
        common_1.Location])
], ShowProductDetailComponent);
exports.ShowProductDetailComponent = ShowProductDetailComponent;
//# sourceMappingURL=show-product-detail.js.map