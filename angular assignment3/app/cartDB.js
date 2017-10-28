"use strict";
var InMemoryDataService2 = (function () {
    function InMemoryDataService2() {
    }
    InMemoryDataService2.prototype.createDb = function () {
        var CARTARRAY = [
            { id: 1, title: "Sony", price: 200 },
            { id: 2, title: "Skulcandy", price: 330 },
            { id: 5, title: "SmartPhone", price: 2032 }
        ];
        return { CARTARRAY: CARTARRAY };
    };
    return InMemoryDataService2;
}());
exports.InMemoryDataService2 = InMemoryDataService2;
//# sourceMappingURL=cartDB.js.map