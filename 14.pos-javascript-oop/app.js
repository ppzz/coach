'use strict';

/* This is an example for reading & writing in console.

var readline = require('readline');

var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('What is your name? ', function(answer) {

  console.log('Hello ' + answer + '!');

  rl.close();
});

*/

var Main = require('./src/main/main');

console.log(Main.printInvoice());
