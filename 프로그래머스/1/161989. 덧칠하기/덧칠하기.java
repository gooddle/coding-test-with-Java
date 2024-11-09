class Solution {
  public int solution(int n, int m, int[] section) {
    int answer = 0;        // 최소 페인트칠 횟수
    int currentPos = 0;    // 현재 페인트칠을 시작할 위치
    
    for (int i = 0; i < section.length; i++) {
        if (section[i] > currentPos) { 
            answer++;                   
            currentPos = section[i] + m - 1;
        }
    }
    
    return answer;
}
}