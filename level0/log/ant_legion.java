// 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있고
// 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥 가능
// 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성


// Solution
class Solution {
    public int solution(int hp) {
        int[] list = {5, 3, 1};
        int answer = 0;

        for(int i = 0; i < list.length; i++) {
            answer += hp / list[i];
            hp %= list[i];
        }

        return answer;
    }
}

// 이렇게 하는게 빠르긴함... 코테는 재사용성보다 얼마나 빠르게 문제 해결하는지를 보는거라서..
class Solution {
    public int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp / 1;

        return answer;
    }
}


// 내 풀이 -> 몫 계산하고 남은 나머지를 다음 단계에서 반영하지 않음
// 23을 5로 나누면 나머지가 3인데 3으로 다음 for문 계산해야하는데 23으로 다시 계산하고 있었음
class Solution {
    public int solution(int hp) {
        int[] list = {5, 3, 1};
        int[] array = new int[list.length];
        int answer = 0;

        for(int i = 0; i < list.length; i++) {
            array[i] = hp / list[i];
            answer += array[i];
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


// 동전개수 구하기 보고 따라해봤는데 잘 따라했구만 나름