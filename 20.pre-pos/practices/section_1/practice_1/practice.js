function collect_same_elements(collection_a, collection_b) {
  //在这里写入代码
  var temp = [];
  collection_a.forEach(function (item) {
    if (collection_b.indexOf(item)!== -1) {
      temp.push(item);
    }
  });

  return temp;
}

module.exports = collect_same_elements;
