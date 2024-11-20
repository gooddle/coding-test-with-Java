import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = n; i < num_list.length; i++){
              result.add(num_list[i]);
        }
        for(int j = 0 ; j<n; j++){
            result.add(num_list[j]);
        }
        return result;
    }
}