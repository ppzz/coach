'use strict';

var expect = require('chai').expect;
var Promotion = require('../../main/model/promotion');

describe('Promotion', function() {

  it('can instantiate by constructor', function() {
    var promotion = new Promotion('TYPE', ['BARCODE1', 'BARCODE2']);

    expect(promotion.type).to.equal('TYPE');
    expect(promotion.barcodes).to.deep.equal(['BARCODE1', 'BARCODE2']);
  });

  describe('.all()', function() {

    it('should return array', function() {
      var result = Promotion.all();
      expect(result).to.be.a('array');
    });
  });

  describe('.findByType()', function() {

    beforeEach(function() {
      Promotion._promotions = [
        new Promotion('PROMOTION1', []),
        new Promotion('PROMOTION2', [])
      ];
    });

    it('can find promotion by type', function() {
      var result = Promotion.findByType('PROMOTION1');
      expect(result.type).to.equal('PROMOTION1');
    });

    it('if not find promotion then return undefined', function() {
      var result = Promotion.findByType('PROMOTIONX');
      expect(result).to.be.undefined;
    });
  });

  describe('#barcodes', function() {

    var promotion;

    beforeEach(function() {
      promotion = new Promotion();
    });

    it('should be array type', function() {
      expect(promotion.barcodes).to.be.a('array');
    });

    it('has default value []', function() {
      expect(promotion.barcodes).to.deep.equal([]);
    });
  });
});
