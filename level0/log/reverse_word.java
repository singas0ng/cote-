// my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성

// Solution 1
import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = new StringBuilder(my_string).reverse().toString();
        // stringBuilder 까지는 좋았는데 toString으로 치환해줘야함 --> answer 가 string이니까

        return answer;
    }
}


// Solution 2
// StringBuilder를 사용하지 않고 풀고 싶으면 이렇게 풀기 --> index로 접근해서 풀기(i는 거꾸로 접근)
class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer+=my_string.charAt(i);
                            // string 안에 있는 글자 하나씩 접근하고 싶으면 charAt 사용
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