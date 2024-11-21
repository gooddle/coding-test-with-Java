class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result = Integer.toString(a);
        String result2 = Integer.toString(b);
        String num1 = a +""+ b;
        int num2 = Integer.parseInt(num1);
        if(num2 > 2 * a * b){
            answer = num2;
        }
        else if(num2 <= 2 * a * b){
            answer = 2 * a * b;
        }
        return answer;
    }
}