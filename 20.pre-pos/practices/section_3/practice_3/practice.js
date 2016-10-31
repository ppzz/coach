function create_updated_collection(collection_a, object_b) {
  //在这里写入代码
  // step1:  汇总数据
  function getObj(collection_a) {
    var temp = [];
    var lastItem = null;
    collection_a.forEach(function (item) {
      if (item === lastItem) {
        temp[temp.length - 1].count++;
      } else {
        temp.push({
          key: item,
          count: 1
        });
      }
      lastItem = item;
    });
    return temp;
  }

  function reduceByObject(newCollection, collectionB) {
    return newCollection.map(function (item) {
      if (collectionB.indexOf(item.key) ===-1) {
        return item;
      }
      item.count -= Math.floor(item.count / 3);
      return item;
    });
  }

  var newCollection = getObj(collection_a);
  return reduceByObject(newCollection, object_b.value);

}

module.exports = create_updated_collection;
