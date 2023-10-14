
let  result=0;

function reverse(n){
    while(n!=0){
       var tmp = Math.floor(n%10);
       result = result*10 + tmp;
       n=Math.floor(n/10);
       console.log(n);
    }

    return result;
};
result = reverse(792638);
console.log("The reversed number "+ result);