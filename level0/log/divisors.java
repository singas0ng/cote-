// 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성


// Solution => 맞긴했는데 구글링해서..
import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        // ArrayList<Integer> → int[] 변환하면서 Integer → int 변환까지 자동으로 처리
        return list.stream().mapToInt(i -> i).toArray();
    }
}


// Problem
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        return answer;
    }
}