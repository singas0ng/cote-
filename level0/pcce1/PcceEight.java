// if 문은 조건을 한 번만 검사하고 한 번만 실행됨
// 수정된 닉네임의 길이가 4보다 작으면, 길이가 4가 될 때까지 추가해야 하므로 while문 사용

class Solution {
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        while (answer.length() < 4){
        //if (answer.length() < 3)
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}