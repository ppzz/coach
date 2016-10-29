'use strict';

var _ = require('lodash');

var Promotion = (function() {

  function Promotion(type, barcodes) {
    this.type = type;
    this.barcodes = barcodes || [];
  }

  // Test data, should load from database in future.
  Promotion._promotions = [
    new Promotion('BUY_TWO_GET_ONE_FREE', [
      'ITEM000000',
      'ITEM000001',
      'ITEM000005'
    ])
  ];

  Promotion.all = function() {
    return this._promotions;
  };

  Promotion.findByType = function(type) {
    return _.find(this._promotions, { type: type });
  };

  return Promotion;

})();

module.exports = Promotion;
