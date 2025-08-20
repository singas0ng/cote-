// 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성


// 다른 식 Solution
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i< my_string.length(); i++){
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}


// 내 풀이 => 맞았는데 구글링해서 보고 한거니까..
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c = my_string.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (Character.isUpperCase(c[i])) {
                answer += Character.toLowerCase(c[i]);
            } else {
                answer += Character.toUpperCase(c[i]);
            }
        }

        return answer;
    }
}


// Problem
class Solution {
    public String solution(String my_string) {
        String answer = "";
        return answer;
    }
}