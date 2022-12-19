// let arr = [1, 2, 3, 4];
// let is block scope
// var is global scope
// var s = 5
//     , b = 6;
// console.log(s + b);
"use strict"
var x = "HH"
function helo() {
    var x = "HH"
    console.log("Hello" + x)
    return x;
}
helo()
console.log(x)

var x = "10"
x = +x
console.log(x)
// Logical and &&  ,OR ||
console.log(10 && 11)

//Push inserts at end in array
//unshift inserts atv 0th index
// pop at end
// shift remove at start
let ar = ["h1", "h2", "h3", 5, 6, 8, 5, 4]
let nr = ["h4", ...ar]
console.log(nr)
console.log(nr.splice(1, 3))
console.log(nr.splice(2, 2, "H5", "H6"))