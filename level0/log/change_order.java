// 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성
// "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째, 24번째 글자를 합친 "attack"을 return (code = 4)

// 다른 Solution
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i< num_list.length; i++) {

            // 이러면 n이 초기화되면서 인덱스 0번째부터 이어서 채워짐
            if (n == num_list.length) {
                n = 0;
            }

            // 위에 if 에서 안걸리면 바로 여기로 넘어옴
            answer[i] = num_list[n];

            // n값을 하나씩 증가하는게 중요
            n++;

        }
        return answer;
    }
}


class Solution {
    public int[] solution(int n, int k) {

        // 이것도 배열 크기 먼저 구하고
        int count = n / k;

        int[] answer = new int[count];

        // 배열 크기만큼 반복문 돌리기
        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
}


// 내 풀이 -> 답은 맞는데 반복문 두 번 작성한게 좀 그랬음
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for(int i = n; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }

        for(int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}


// Problem
class Solution {
    public int[] solution(int[] num_list, int n {
        int[] answer = {};
        return answer;
    }
}