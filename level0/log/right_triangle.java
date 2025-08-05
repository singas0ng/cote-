// 정수 배열 numbers가 매개변수로 주어질 때 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성

// Solution

// Solution
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                // 한 줄 안에서 몇 개의 별을 찍을지 구하는 용도
                System.out.print("*");
            }
            System.out.println();
            // j for문에서 한 줄 별을 다 찍고 나면 다음 줄로 이동시키는 역할
        }
    }
}


// 내 풀이 문제점 -> 그냥 총체적 난국.... 대체 뭘 표현하고 싶었던걸까
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = sc.next();

        for(int i = 0; i <= n; i++) {
            answer += "*";
        }

        System.out.println(answer);
    }
}


// Problem
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n);
    }
}