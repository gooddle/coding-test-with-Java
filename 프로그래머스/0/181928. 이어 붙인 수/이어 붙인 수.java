class Solution {
    public int solution(int[] num_list) {
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        // 짝수만 이어 붙임
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                result.append(num_list[i]);
            }
            if(num_list[i] % 2 == 1 ){
                result2.append(num_list[i]);
            }
        }

        // StringBuilder 내용을 정수로 변환
        int finalResult = Integer.parseInt(result.toString());
        int finalResult2 = Integer.parseInt(result2.toString());
        return finalResult+finalResult2;
    }
}