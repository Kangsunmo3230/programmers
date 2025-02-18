package org.example.level1;

import java.util.Arrays;

/**
 * x만큼 간격이 있는 n개의 숫자
 */
public class question3 {
    public static void main(String[] args) {

        int x = 2;
        int n = 5;
        long[] answer = new long[n];


        for (int i = 1; i < n + 1; i++) {
            answer[i-1] = x * i;
        }

        // 방법 1: Arrays.toString() 사용 (한 줄 출력)
        System.out.println(Arrays.toString(answer));
        // 방법 2: Stream API 사용
        Arrays.stream(answer).forEach(System.out::println);
    }
}
