// find and fix the bug in given code. You can change only one line of the given code
// The sum of angle1 and angle2 is 765 degrees. Subtracting 720 from 765 results in 45 degrees, so output 45.
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;

        // 원래는 System.out.println(sum_angle);
        System.out.println(sum_angle % 360);
    }
}