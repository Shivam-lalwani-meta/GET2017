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
var Products = (function () {
    function Products(prodService) {
        this.prodService = prodService;
        this.title = 'Tour of pro';
    }
    Products.prototype.getProducts = function () {
        var _this = this;
        this.prodService.getProducts().then(function (prodArray) { return _this.prodArray = prodArray; });
    };
    Products.prototype.ngOnInit = function () {
        this.getProducts();
    };
    Products.prototype.onSelect = function (prod) {
        this.selectedProd = prod;
    };
    return Products;
}());
Products = __decorate([
    core_1.Component({
        selector: 'my-app',
        template: "<div class=\"jumbotron\">\n                <h2 class=\"text-center\">{{title}}</h2>\n             </div>\n             <div class=\"main-content\">\n                <div class=\"container\">\n                   <div class=\"row\">\n                       <div class=\"col-lg-3 col-md-4 col-xs-6\" *ngFor=\"let prod of prodArray\" [class.selected]=\"prod === selectedProd\"\n                        (click)=\"onSelect(prod)\">\n                          <div class=\"card\">\n                             <div class=\"card-header\">\n                               <h3 class=\"card-title\">{{prod.title}}</h3>\n                             </div>\n                             <div class=\"card-body\">\n                               <p>\n                                 Product ID: {{prod.title}} <br>\n                                 Rs. {{prod.price}}\n                               </p>\n                             </div>\n                          </div>\n                       </div>\n                   </div>\n                </div>\n              <product-detail [prod]=\"selectedProd\"></product-detail>\n              </div>\n  ",
        styles: ["\n \n  .card-header {\n    display: block;\n    background-color: #FFFFFF;\n    }\n    \n    .card {\n    display: block;\n    border: 2px solid #D0DEF7;\n    padding: 10px;\n    background-color: #D0DEF7;\n    text-align: center;\n    box-shadow: 0 0 9px 0px #5a5858;\n    margin: 20px;\n    transition: transform 1s;\n    }\n    .card:hover{\n    transform :scale(1.1,1.1);\n    }\n    \n    .card-title {\n    background-color: #D0DEF7;\n    margin-block-start: 0px;\n    }\n    .jumbotron {\n    background-color: #e2f2ff;\n    }\n    .card-body {\n    background-color: #FFFFFF;\n    padding: 6px;\n    width: 110%;\n    margin-left: -5%;\n    }\n"],
        providers: [product_service_1.ProductService]
    }),
    __metadata("design:paramtypes", [product_service_1.ProductService])
], Products);
exports.Products = Products;
//# sourceMappingURL=app.component.js.map