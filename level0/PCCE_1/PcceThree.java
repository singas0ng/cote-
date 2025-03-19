//you have to find and fix the bug in given code. You can change only one line of the given code
//An error message will be shown in the Result area when you modify more than 2 lines of the given code.
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        //  원래는 for(int i=0; i<, i++){
        while(number != 0){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}