'use strict';

var sinon = require('sinon');
var expect = require('chai').expect;
var HelloWorld = require('../main/hello-world');

describe('HelloWorld', function() {

  it('demo test', function() {
    expect('Hello World').to.equal('Hello World');
  });

  it('should be mock', function() {
    var helloWorld = sinon.createStubInstance(HelloWorld);
    helloWorld.beenCalled.returns('Hello World');

    expect(helloWorld.beenCalled()).to.equal('Hello World');
  });
});
