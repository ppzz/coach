'use strict';

var China = require('./china');
var Germany = require('./germany');
var Japan = require('./japan');

var CountryFactory = (function() {

  function CountryFactory() {}

  CountryFactory.prototype.getCountry = function(name) {

    var country;

    switch (name) {
      case 'China':
        country = new China();
        break;
      case 'Germany':
        country = new Germany();
        break;
      case 'Japan':
        country = new Japan();
        break;
    }

    return country;
  };

  return CountryFactory;

})();

module.exports = CountryFactory;
