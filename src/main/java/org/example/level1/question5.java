package org.example.level1;

import java.util.ArrayList;

/**
 * 정수 제곱근 판별
 */
public class question5 {
    public static void main(String[] args) {
        long n = 3;

        long result = -1;
        // 1. 제곱근 구하기
        double value = Math.sqrt(n);
        // 2. 다시 제곱으로 곱해서 해당 값이 n 인지 판별
        Math.pow((int) value, 2);
        System.out.println(value);

        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            result =  (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        //제곱근

    }


}
