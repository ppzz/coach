"use strict";
var _ = require("lodash");
var chai = require("chai");
var sinon = require("sinon");
var sinonChai = require("sinon-chai");
var expect = chai.expect;
chai.use(sinonChai);

describe("practice_2 学生成绩单-2", function () {
  it("打印成绩单", function () {
    sinon.spy(console, 'log');

    require("../../src/practice_2")
    var result = _.flatten(console.log.args).join("\n");
    var expect_string = '下面是某班部分学生的成绩\n王雪雪\t语文131 数学136 英语144\n杨璐璐\t语文131 数学129 英语144\n韩林霖\t语文126 数学139 英语142\n沙龙逸\t语文124 数学148 英语136\n===============================\n平均分\t语文128 数学138 英语141.5';

    expect(expect_string).to.equal(result);
  });
});
