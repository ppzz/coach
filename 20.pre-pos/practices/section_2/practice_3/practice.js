var pra2 = require('../practice_2/practice');
function count_same_elements(collection) {
  //在这里写入代码
  var collection_copy = collection.map(function (item) {
    item = item.replace(':', '-');
    item = item.replace('[', '-');
    item = item.replace(']', '');
    return item;
  });

  var temp = pra2(collection_copy);

  return temp.map(function (item) {
    return {
      name: item.key,
      summary: item.count
    };
  });
}

module.exports = count_same_elements;
