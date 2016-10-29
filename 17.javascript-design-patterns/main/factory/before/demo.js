'use strict';

var China = require('./china');
var Germany = require('./germany');
var Japan = require('./japan');

function run() {
  
  var china = new China();

  var germany = new Germany();

  var japan = new Japan();

  return china.getName() + ' / ' + germany.getName() + ' / ' + japan.getName();
}

exports.run = run;
