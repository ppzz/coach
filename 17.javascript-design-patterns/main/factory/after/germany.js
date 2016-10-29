'use strict';

var Country = require('./country');

var Germany = (function() {

  function Germany() {

    Country.call(this);

    this._name = 'Germany';
  }

  Germany.prototype = Object.create(Country.prototype);

  Germany.prototype.constructor = Germany;

  Germany.prototype.getName = function() {
    return this._name;
  };

  return Germany;

})();

module.exports = Germany;
