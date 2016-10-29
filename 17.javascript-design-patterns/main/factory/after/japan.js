'use strict';

var Country = require('./country');

var Japan = (function() {

  function Japan() {

    Country.call(this);

    this._name = 'Japan';
  }

  Japan.prototype = Object.create(Country.prototype);

  Japan.prototype.constructor = Japan;

  Japan.prototype.getName = function() {
    return this._name;
  };

  return Japan;

})();

module.exports = Japan;
