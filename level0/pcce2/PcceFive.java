// Fill in the blanks
// "N" moves the dog 1 unit north.
// "S" moves the dog 1 unit south. ==> same as moving -1 unit north.
// "E" moves the dog 1 unit east.
// "W" moves the dog 1 unit west. ==> same as moving -1 unit east.

class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}