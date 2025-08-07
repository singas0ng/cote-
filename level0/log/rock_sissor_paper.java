// 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있고
// 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥 가능
// 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성


// Solution
class Solution {
    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer += '0';
            } else if (rsp.charAt(i) == '0') {
                answer += '5';
            } else {
                answer += '2';
            }
        }

        return answer;
    }
}


// 내 풀이 -> rsp(i) 이런건 없단다.. rsp[i] 이렇게 했다가 바꿨는데 이건 배열에서만 통하는거...
// 문자열의 i번째 문자를 가져오려면 charAt() 써야함
class Solution {
    public String solution(String rsp) {
        String answer = "";

        for(int i = 0; i < rsp.length(); i++) {
            if(rsp(i) == "2") {
                answer += "0";
            } else if (rsp(i) == "0") {
                answer += "5";
            } else {
                answer += "2";
            }
        }

        return answer;
    }
}

// Problem
class Solution {
    public String solution(String rsp) {
        String answer = "";
        return answer;
    }
}


// so close...?