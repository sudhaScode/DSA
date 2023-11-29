
let  result=0;

/*function reverse(n){
    while(n!=0){
       var tmp = Math.floor(n%10);
       result = result*10 + tmp;
       n=Math.floor(n/10);
       console.log(n);
    }

    return result;
};
//result = reverse(792638);
//console.log("The reversed number "+ result);*/

function reverseNum(num){
    num = num +'';

 return num.split("").reverse().join("");	
// join works like if no argument is passed to it it will concat the string with comma(,) or nothing given
// between "" double qoutes it concats without any extra char
// join works like if any argument is passed to it, "*" it concats with that char
}
console.log(reverseNum(3234243));


