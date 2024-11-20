import java.util.*;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> result = new ArrayList<>();
        for(int i =0; i<my_string.length(); i++){
            result.add(my_string.substring(i));
        }
            
            
       Collections.sort(result);
        
        return result;
    }
}