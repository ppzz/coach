var pra1 = require('../practice_1/practice.js');

function collect_same_elements(collection_a, collection_b) {
  //在这里写入代码

  if (collection_b[0] instanceof Array) {
    var b = collection_b[0];
  }
  return pra1(collection_a, b);
}

module.exports = collect_same_elements;
