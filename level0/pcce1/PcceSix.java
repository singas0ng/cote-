class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = total_usage * change[i] / 100;
            usage += usage * change[i] / 100;
            // 원래는 total_usage += usage;
            // * / 는 연산자 우선순위가 같아서 * 먼저 한다음에 / 진행

            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}