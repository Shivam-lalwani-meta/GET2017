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
var order_service_1 = require("./order.service");
var cart_service_1 = require("./cart-service");
var PaymentComponent = (function () {
    function PaymentComponent(orderService, cartService) {
        this.orderService = orderService;
        this.cartService = cartService;
    }
    PaymentComponent.prototype.ngOnInit = function () {
    };
    PaymentComponent.prototype.saveOrder = function (cardN, cardE, cardC) {
        var order = {
            orderId: 0,
            cardNumber: cardN,
            cvv: cardC,
            amount: 10000,
            dop: '',
            userId: localStorage.getItem("username")
        };
        this.orderService.saveOrder(order);
    };
    return PaymentComponent;
}());
PaymentComponent = __decorate([
    core_1.Component({
        selector: 'my-payment',
        templateUrl: './payment.component.html',
    }),
    __metadata("design:paramtypes", [order_service_1.OrderService,
        cart_service_1.CartService])
], PaymentComponent);
exports.PaymentComponent = PaymentComponent;
//# sourceMappingURL=payment.component.js.map