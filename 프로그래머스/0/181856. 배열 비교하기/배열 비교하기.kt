class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        var num1 = 0
        var num2 =0
        if(arr1.size > arr2.size) answer = 1
        if(arr1.size < arr2.size) answer = -1
        if(arr1.size == arr2.size){
            for(i in 0..arr1.size -1){
                num1+=arr1[i]
            }
            
            for(j in 0..arr2.size -1){
                num2 += arr2[j]
            }
            if(num1 > num2) answer =1
            if(num2>num1) answer =-1
            if(num1 == num2) answer =0
            
        }
        
           
        return answer
    }
}