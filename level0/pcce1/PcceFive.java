//fill in the blanks
//cpr[] = "call", "respiration", "repeat", "check", "pressure" corresponds to the 2nd, 4th, 5th, 1st, and 3rd steps respectively, so it returns [2, 4, 5, 1, 3].

class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
                        //fill in the blanks
            for(int j=0; j< basic_order.length; j++){
                            //fill in the blanks
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j + 1;
                                //fill in the blanks
                    break;
                }
            }
        }
        return answer;
    }
}