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
var ProductDetailInWell = (function () {
    function ProductDetailInWell() {
    }
    return ProductDetailInWell;
}());
__decorate([
    core_1.Input(),
    __metadata("design:type", product_component_1.Products)
], ProductDetailInWell.prototype, "prod", void 0);
ProductDetailInWell = __decorate([
    core_1.Component({
        selector: 'prod-well',
        template: "\n    <div class=\"well\">\n        <div *ngIf=\"selectedProd\">\n            <h2>{{selectedProd.title}} details!</h2>\n            <div><label>price: </label>{{selectedProd.price}}</div>\n            <div>\n                <label>title: </label>\n                <input [(ngModel)]=\"selectedProd.title\" placeholder=\"title\"/>\n            </div>\n         </div>\n    </div> \n    "
    })
], ProductDetailInWell);
exports.ProductDetailInWell = ProductDetailInWell;
//# sourceMappingURL=product-detail-inwell.js.map