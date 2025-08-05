// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성

// Solution
class Solution {
    public int[] solution(int n, int[] numlist) {
        // numlist에서 n의 배수인 요소가 몇 개인지 구하기
        int count = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }

        // 배수 개수만큼 크기를 가진 배열 생성
        int[] answer = new int[count];

        // 다시 한 번 순회하면서 배수만 answer에 담기
        int idx = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                answer[idx++] = num;
            }
        }

        return answer;
    }
}


// 내 풀이 문제점 -> 그냥 인접한 얘들끼리 곱했음... 그래서 인접한 얘들끼리 곱하지 않았을 경우 더 큰 숫자 나올 수 있음
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        // 배열 크기를 이렇게 고정해버리면 아래 for문에서 조건에 맞지 않으면 해당 index 자리에 0 값이 들어감

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[i] = numlist[i];
            }
        }

        return answer;
    }
}

// Problem
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        return answer;
    }
}