import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =n-1; i<num_list.length; i++){
            result.add(num_list[i]);
     
        }
         return result;
    }
   
}