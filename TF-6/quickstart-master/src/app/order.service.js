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
var http_1 = require("@angular/http");
var OrderService = (function () {
    function OrderService(http) {
        this.http = http;
        this.orderAddUrl = 'http://localhost:8080/Assignment4/rest/product/getAllOrder';
        this.orderSaveUrl = 'http://localhost:8080/Assignment4/rest/product/order';
        this.getOrderDetailUrl = "http://localhost:8080/Assignment4/rest/product/getOrderDetail";
        this.headers = new http_1.Headers({ 'Content-Type': 'application/json' });
    }
    OrderService.prototype.getOrder = function () {
        this.currentUser = localStorage.getItem("username");
        var url = this.orderAddUrl + "/" + this.currentUser;
        return this.http.get(url)
            .toPromise()
            .then(function (response) { return response.json(); })
            .catch();
    };
    OrderService.prototype.saveOrder = function (order) {
        this.currentUser = localStorage.getItem("username");
        var url = this.orderSaveUrl + "/" + this.currentUser;
        console.log(order.amount + "cvv" + order.cvv + "cardnumber" + order.cardNumber);
        return this.http.post(url, JSON.stringify({ amount: order.amount, cvv: order.cvv, cardNumber: order.cardNumber }), { headers: this.headers })
            .toPromise()
            .catch();
    };
    OrderService.prototype.getOrderDetail = function (orderId) {
        var url = this.getOrderDetailUrl + "/" + orderId;
        console.log(url);
        return this.http.get(url)
            .toPromise()
            .then(function (response) { return response.json(); })
            .catch();
    };
    return OrderService;
}());
OrderService.order = [];
OrderService.orderDetail = [];
OrderService = __decorate([
    core_1.Injectable(),
    __metadata("design:paramtypes", [http_1.Http])
], OrderService);
exports.OrderService = OrderService;
//# sourceMappingURL=order.service.js.map