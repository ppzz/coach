'use strict';

var expect = require('chai').expect;
var Item = require('../../main/model/item');

describe('Item', function() {

  it('can instantiate by constructor', function() {
    var item = new Item('BARCODE', 'ITEM', 'UNIT', 9.99);

    expect(item.barcode).to.equal('BARCODE');
    expect(item.name).to.equal('ITEM');
    expect(item.unit).to.equal('UNIT');
    expect(item.price).to.equal(9.99);
  });

  describe('.all()', function() {

    it('should return array', function() {
      var result = Item.all();
      expect(result).to.be.a('array');
    });
  });

  describe('.findByBarcode()', function() {

    beforeEach(function() {
      Item._items = [
        new Item('BARCODE1', 'ITEM1', 'UNIT1', 1.00),
        new Item('BARCODE2', 'ITEM2', 'UNIT2', 2.00),
      ];
    });

    it('can find item by barcode', function() {
      var result = Item.findByBarcode('BARCODE1');
      expect(result.barcode).to.equal('BARCODE1');
    });

    it('if not find item then return undefined', function() {
      var result = Item.findByBarcode('BARCODEX');
      expect(result).to.be.undefined;
    });
  });

  describe('#price', function() {

    var item;

    beforeEach(function() {
      item = new Item();
    });

    it('should be number type', function() {
      expect(item.price).to.be.a('number');
    });

    it('has default value 0.00', function() {
      expect(item.price).to.equal(0.00);
    });
  });
});
