/**
 * 
 */
function minSort(array) {//,3,5,6,2,4,1
		 let result= [];
		 let n= array.length;
		 let tmp =0;
		 for(let i=0;i<n-1;i++) {
			 tmp = array[i];
		  for(let j=0;j<n;j++) {
			  tmp = Math.min(tmp, array[j]);
		  }
          //console.log(tmp)
          result.push(tmp);
          tmp = array.indexOf(tmp);
          array[tmp] = Number.MAX_VALUE; 
		 }
	return result;
	}
	console.log(minSort([3,5,6,2,4,1]));