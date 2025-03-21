// 이스 아메리카노는 한잔에 5,500원
// 가지고 있는 돈 money가 매개변수로 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성하기
// {} : 크기랑 값 둘다 생성 가능 ==> 그냥 {} 이거면 값(요소)이 0으로 초기화된 것이 아니라, 아예 요소 자체가 없는 것
// [] : 배열 크기만 생성하고 값(요소)은 0으로 초기화

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}



// Problem
class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        // 배열은 한번 생성하면 크기를 변경할 수 없음
        // 따라서 크기를 지정해주어야 함
        // 지금은 크기가 0인 배열을 생성한 것
        // {} 안에는 배열 값을 넣으면 됨 => {1, 2, 3} 이런식으로 하면 크기와 값이 한번에 지정됨

        return answer;
    }
}