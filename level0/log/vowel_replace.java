//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류하는데 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return

class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}

// replaceAll은 정규 표현식으로 문자열에서 특정 패턴을 찾아서 대체하는 메소드
// "[aeiou]"는 정규 표현식으로 a, e, i, o, u 중 하나에 해당하는 모든 문자를 찾는 패턴


class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = new String[]{"a", "e", "i", "o", "u"};

        for(int i = 0; i < str.length; i++){
            if(my_string.contains(str)){
                answer = my_string.replace(str[i], "");
            }
        }
        return answer;
    }
}

// replace 메소드는 문자열에서 특정 문자열을 다른 문자열로 대체하는 메소드