// 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성
// "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째, 24번째 글자를 합친 "attack"을 return (code = 4)

// Solution
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }

        return answer;
    }
}


// 내 풀이 문제점
// -> code 번째 글자를 가져오고 싶으면, 실제 배열 인덱스로는 code - 1부터 시작하는데 그냥 0부터 시작
// 증감식에 1씩 더하는게 아니라 다음에 가져와야 하는 위치까지 건너뛰어야 해서 code만큼 더하기. 그래야 code의 배수가 나오지
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i = 0; i < cipher.length(); i++) {
            if(cipher.length() % code == 0) {
                answer += cipher.charAt(i);
            }
        }

        return answer;
    }
}

// Problem
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        return answer;
    }
}