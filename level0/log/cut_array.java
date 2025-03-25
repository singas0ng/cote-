// 배열 numbers가 주어질 때, num1번째부터 num2번째까지의 원소를 가지는 배열을 반환하는 함수를 작성

// Solution
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for(int i = 0; i < numbers.length; i++) {
            if(i >= num1 && i <= num2) {
                // 배열 numbers를 순회하면서 인덱스가 num1부터 num2 사이에 해당하는 경우에만 값을 처리
                answer[i - num1] = numbers[i];
                // 예를 들어, 만약 num1이 2라면:
                // i가 2일 때, i - num1는 2 - 2 = 0이 되어 answer[0]에 numbers[2]를 저장
                // i가 3일 때, 3 - 2 = 1이 되어 answer[1]에 numbers[3]을 저장
            }
        }

        return answer;
    }
}

// Problem
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        return answer;
    }
}



// 그래도 answer의 크기 지정해준 것 칭찬해!