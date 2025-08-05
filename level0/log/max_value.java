// 정수 배열 numbers가 매개변수로 주어질 때 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성

// Solution
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}


class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 같은 위치의 값을 곱해선 안되기 때문에 j의 시작 위치를 i + 1 부터 시작
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;

        return answer;
    }
}


// 내 풀이 문제점 -> 그냥 인접한 얘들끼리 곱했음... 그래서 인접한 얘들끼리 곱하지 않았을 경우 더 큰 숫자 나올 수 있음
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] answer = new int[numbers.length - 1];
        // 안에 있는 값들을 곱하면 길이가 length보다 하나씩 줄어듦
        // 크기를 지정해줘야함
        // int[] answer = {}; 이거 안됨... 분명 이거 오답썼을텐데..왜....

        for (int i = 0; i < numbers.length - 1; i++) {
            answer[i] = numbers[i] * numbers[i + 1];
        }

        Arrays.sort(answer);
        // 오름차순 순으로 정렬됨 -> 제일 큰 숫자가 마지막에 배치

        return answer[answer.length - 1];
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