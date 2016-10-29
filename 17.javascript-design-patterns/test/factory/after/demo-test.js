'use strict';

describe('factory after demo', function() {

  it('should print correct result', function() {
    var demo = require('../../../main/factory/after/demo');

    demo.run()

    expect(demo.run()).to.equal('China / Germany / Japan');
  });
});
