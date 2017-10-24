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
var order_service_1 = require("./order.service");
var OrderComponent = (function () {
    function OrderComponent(orderServices, router) {
        this.orderServices = orderServices;
        this.router = router;
    }
    OrderComponent.prototype.ngOnInit = function () {
        this.getOrderProduct();
    };
    OrderComponent.prototype.getOrderProduct = function () {
        var _this = this;
        this.orderServices.getOrder().then(function (order) { return _this.order = order; });
    };
    OrderComponent.prototype.goToDetail = function (orderId) {
        this.router.navigate(['/orderDetail', orderId]);
    };
    return OrderComponent;
}());
OrderComponent = __decorate([
    core_1.Component({
        selector: 'my-order',
        templateUrl: './order.component.html',
    }),
    __metadata("design:paramtypes", [order_service_1.OrderService, router_1.Router])
], OrderComponent);
exports.OrderComponent = OrderComponent;
//# sourceMappingURL=order.component.js.map