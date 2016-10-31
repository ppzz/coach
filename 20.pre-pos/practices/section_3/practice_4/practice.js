function create_updated_collection(collection_a, object_b) {
  //在这里写入代码
  // step1: 将数字变成对象
  // step2: 讲对象做一个统计
  // step3: 将上述的结果做3-1


  function spread(collection_a) {
    return collection_a.map(function (item) {
      if (item.indexOf('-') === -1) {
        return {
          key: item,
          count: 1
        }
      }

      var foo = item.split('-');
      return {
        key: item[0],
        count: Number(foo[1])
      };
    });
  }

  function aggregation(temp) {
    var bar = [];
    var lastItem = null;

    temp.forEach(function (item) {
      if (item.key !== lastItem) {
        bar.push(item);
        return lastItem = item.key;
      }
      bar[bar.length - 1].count += item.count;
    });
    return bar;
  }

  function reduce3(temp, value) {
    return temp.map(function (item) {
      if (value.indexOf(item.key)===-1) {
        return item;
      }
      item.count -= Math.floor(item.count / 3);
      return item;
    });
  }

  var temp = spread(collection_a);
  temp = aggregation(temp);
  temp = reduce3(temp, object_b.value);
  return temp;
}

module.exports = create_updated_collection;
