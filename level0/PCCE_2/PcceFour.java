// Fill in the blanks

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
                    // blank
            month++;
        }
        while (money < 100) {
               // blank
            money += after;
            // blank
            month++;
        }

        System.out.println(month);
    }
}