function count_same_elements(collection) {
  //在这里写入代码
  var temp = [];
  var lastItem = null;
  collection.forEach(function (item) {
    if (item !== lastItem) {
      temp.push({key: item, count: 1});
    } else {
      temp[temp.length - 1].count ++;
    }
    lastItem = item;
  });

  return temp;
}

module.exports = count_same_elements;
