// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 하는데, n이 제곱수라면 1을 아니라면 2를 return

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(i * i == n) {
                // 같은 수일 때가 제곱근이니까 i랑 i가 같은 수여야 함
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        return answer;
    }


    //        int answer = 2;
    //        for(int i=1; i<n; i++){
    //            if(n/i == i && n%i == 0){
    //                answer = 1;
    //                break;
    //            }
    //        }
    //        return answer;



    //        if(Math.sqrt(n) % 1 == 0){
    //            answer = 1;
    //        }else{
    //            answer = 2;
    //        }
    //
    //        return answer;
}