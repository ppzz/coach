var pra1 = require('../practice_2/practice');
function count_same_elements(collection) {
  //在这里写入代码
  var collection_copy = collection.map(function (item) {
    var split = item.split('-');
    var key =split[0];
    var count = split[1] || '1';
    count = Number(count);
    return {key: key, count: count};
  });

  var temp = [];

  var lastItem = {};
  collection_copy.forEach(function (item) {
    if (item.key !== lastItem.key) {
      temp.push(item);
    } else {
      temp[temp.length - 1].count += item.count;
    }
    lastItem = item;
  });

  return temp;
}

module.exports = count_same_elements;
