"use strict";
var _ = require("lodash");
var chai = require("chai");
var sinon = require("sinon");
var sinonChai = require("sinon-chai");
var expect = chai.expect;
chai.use(sinonChai);

var Person = require('../../src/practice_3_OO/practice_12.js');
describe("OO入门", function () {
  it("对象之间的交互-6", function () {
    var person = new Person('01', 'Tom', 21);

    var result = person.introduce();
    var expect_string = 'My name is Tom. I am 21 years old.';

    expect(expect_string).toEqual(result);
  });

  it('// 其余测试用例参见readme自己完成');
});
