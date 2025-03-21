// 고치기
// numbers: [1]	 our_score: [100]	score_list: [100, 80, 90, 84, 20]	result = ["Same"]
// numbers: [3, 4]	our_score: [85, 93]	score_list = [85, 92, 38, 93, 48, 85, 92, 56]	result = ["Different", "Same"]

// The score of the first student that was graded is 100, which is the same as the actual score, so "Same" is included in the list and returned.

// Different" is included in the answer list for the 3rd student, who scored 85 points but actually got 38 points.
// "Same" is included in the answer list for the 4th student, who scored 93 points and actually got 93 points.
// answer list is returned

class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] -  1]) {
                                //score_list[i]
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}