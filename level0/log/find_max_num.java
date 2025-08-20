// 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성
// 1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있음


// 다른 식 Solution
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2]; // 이렇게 했었는데...

        for(int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}


// Solution -> clone으로 원본 순서는 건들면 안되니까 복사해서 sort 하기
import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        int[] a = array.clone();
        Arrays.sort(a);

        list.add(a[array.length - 1]);

        for(int i = 0; i < array.length; i++) {
            if(array[i] == a[array.length - 1]) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}


// 내 풀이 -> 맞았는데 구글링해서 보고 한거니까..
import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();

        // 여기가 틀렸어.. Arrays.sort의 return 타입은 void여서 이게 성립이 안된단다
        // array를 제자리 정렬하고 끝나는 메소드라 정렬된 배열을 반환하지 않는단다
        int[] a = Arrays.sort(array);


        list.add(a[array.length - 1]);

        for(int i = 0; i < array.length; i++) {
            if(array[i] == a[array.length - 1]) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}


// Problem
class Solution {
    public String solution(String my_string) {
        String answer = "";
        return answer;
    }
}