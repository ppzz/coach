function create_updated_collection(collection_a, object_b) {
  //在这里写入代码
  var temp = collection_a.map(function (item) {
    if (object_b.value.indexOf(item.key) === -1) {
      return item;
    }
    item.count -= Math.floor(item.count / 3);
    return item;
  });

  return temp;
}

module.exports = create_updated_collection;
