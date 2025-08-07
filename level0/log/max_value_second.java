// 정수 배열 numbers가 매개변수로 주어질 때 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성

// Solution
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int a = numbers[0] * numbers[1];
        int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}


// 내 풀이 문제점 -> numbers가 2, -3 만 있을 때 최대값이 -6 이여야하는데 answer 이 0 인 상태에서 비교하면 당연히 0을 return 해서 최대값이 틀림
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }

        return answer;
    }
}

// Problem
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        return answer;
    }
}



// 그래도 answer 을 배열로 바꾸는거랑 answer 에 곱하기 값 넣어주는건 칭찬해~