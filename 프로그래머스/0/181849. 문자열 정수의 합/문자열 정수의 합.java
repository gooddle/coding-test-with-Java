class Solution {
    public int solution(String num_str) {
        int[] result = new int[num_str.length()];

        for (int i = 0; i < num_str.length(); i++) {
            result[i] = num_str.charAt(i) - '0';
        }

        int sum = 0;
        for (int num : result) {
            sum += num;
        }

        return sum;
    }
}