'use strict';

var Country = require('./country');

var China = (function() {

  function China() {

    Country.call(this);

    this._name = 'China';
  }

  China.prototype = Object.create(Country.prototype);

  China.prototype.constructor = China;

  China.prototype.getName = function() {
    return this._name;
  };

  return China;

})();

module.exports = China;
