//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return

class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += n % 10; // 마지막 자리 꺼내서 더하기(나머지)
            n /= 10; // 몫으로 나누기(그러면 마지막 자리는 사라짐) => n = n / 10

            //ex) 1234 % 10 = 4, 1234 / 10 = 123
        }

        return answer;
    }
}