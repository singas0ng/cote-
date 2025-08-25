// 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성
// n = 10, k = 3 일 때 1 이상 10 이하의 3의 배수는 3, 6, 9 이므로 [3, 6, 9]를 return 합니다.

// 다른 Solution
class Solution {
    public int[] solution(int n, int k) {
        // 인덱스 설정
        int idx = 0;

        // 나눈 몫만큼 배열 크기 지정해주기 -> 15에서 5 나누면 3이니까 그만큼 배수가 있다는 뜻
        int[] answer = new int[n / k];

        for (int i = k; i <= n; i += k) { // 내가 원했던 증감식..
            answer[idx++] = i;
        }

        return answer;
    }
}

// 내 풀이 -> 답은 맞는데 증감식에 배수만큼 더하는 그런거 생각했는데 거기서 그침
import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}


// Problem
class Solution {
    public int[] solution(int[] num_list, int n {
        int[] answer = {};
        return answer;
    }
}