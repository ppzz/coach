var pra1 = require('../practice_1/practice.js');

function collect_same_elements(collection_a, object_b) {
  //在这里写入代码
  var a = collection_a.map(function (item) {
    return item.key;
  });
  var b = object_b.value;

  return pra1(a, b);
}

module.exports = collect_same_elements;
