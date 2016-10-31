var pra1 = require('../practice_1/practice.js');
function collect_same_elements(collection_a, object_b) {
  //在这里写入代码

  if (object_b.value instanceof Array) {
    var b = object_b.value;
  }
  return pra1(collection_a, b);
}

module.exports = collect_same_elements;
