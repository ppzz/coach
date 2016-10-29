'use strict';

var CountryFactory = require('./country-factory');

function run() {

  var factory = new CountryFactory();

  var china = factory.getCountry('China');

  var germany = factory.getCountry('Germany');

  var japan = factory.getCountry('Japan');

  return china.getName() + ' / ' + germany.getName() + ' / ' + japan.getName();
}

exports.run = run;
