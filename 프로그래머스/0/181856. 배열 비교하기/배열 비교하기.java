class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        if(arr1.length>arr2.length) answer = 1;
        if(arr2.length > arr1.length) answer = -1;
        if(arr2.length == arr1.length){
            for(int i=0; i<arr1.length; i++){
                num1+=arr1[i];
            }
            for(int j =0; j<arr2.length; j++){
                num2+=arr2[j];
            }
            
            if(num1 > num2){
                answer = 1;
            }
            if(num2>num1){
                answer = -1;
            }
            if(num1==num2){
                answer =0;
            }
            
        }
        return answer;
    }
}