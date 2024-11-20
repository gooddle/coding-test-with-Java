import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
     StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
            else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c); 
            }
        }

        // 변환된 결과 출력
        System.out.println(result.toString());
    }
}