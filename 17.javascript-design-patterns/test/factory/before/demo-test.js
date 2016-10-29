'use strict';

describe('factory before demo', function() {

  it('should print correct result', function() {
    var demo = require('../../../main/factory/before/demo');

    demo.run()

    expect(demo.run()).to.equal('China / Germany / Japan');
  });
});
