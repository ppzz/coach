'use strict';

var Country = (function() {

  function Country() {
    this._name = 'Country';
  }

  Country.prototype.getName = function() {
    return this._name;
  };

  return Country;

})();

module.exports = Country;
