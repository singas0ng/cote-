// 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수 작성
// 예시) "hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.


// Solution
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {

        // 숫자를 제외한 문자열 빈값으로 대체하고 남은 숫자들만 한 글자씩 잘라서 문자열 배열에 담기
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");

        Arrays.sort(arr);

        int[] answer = new int[arr.length];

        for(int i = 0; i < answer.length; i++) {

            // arr 이 String 이니까 int 로 형변환 해주기
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}

// 내 풀이 -> 음.. 총체적 난국... 정규식 알아두면 좋을거같음..
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];

        for(int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i);
        }

        return answer;
    }
}

// Problem
class Solution {
    public int solution(int hp) {
        int answer = 0;
        return answer;
    }
}