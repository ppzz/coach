function create_updated_collection(collection_a, object_b) {
  //在这里写入代码

  var foo = object_b.value;
  return collection_a.map(function (item) {
    if (foo.indexOf(item.key) === -1) {
      return item;
    }
    item.count--;
    return item;
  });
}

module.exports = create_updated_collection;
