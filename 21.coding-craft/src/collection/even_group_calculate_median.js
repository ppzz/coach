function even_group_calculate_median(collection) {
  var temp = getEvenSeqItems(collection);
  temp = getEvenItems(temp);
  temp = group(temp);
  return temp.map(function (arr) {
    return average(arr);
  });
}

function average(arr) {
  var sum = arr.reduce(function (mem, item) {
    return mem + item;
  }, 0);
  return sum / arr.length;
}

function group(collection) {
  var temp  = {};
  collection.forEach(function (item) {
    var length = item.toString().length;
    if (temp[length] === undefined) {
       return temp[length] = [item];
    }
    temp[length].push(item);
  });
  return Object.keys(temp)
    .map(function (item) {
      return temp[item];
    });
}

function getEvenItems(collection) {
  var temp = [];
  collection.map(function (item) {
    if (isEven(item)) {
      temp.push(item);
    }
  });
  return temp;
}

function getEvenSeqItems(collection) {
  var temp = [];
  collection.forEach(function (item, index) {
    if (!isEven(index)) {
      temp.push(item);
    }
  });
  return temp;
}

function isEven(n) {
  n = Number(n);
  return n === 0 || !!(n && !(n % 2));
}

module.exports = even_group_calculate_median;
