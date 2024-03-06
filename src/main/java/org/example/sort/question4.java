package org.example.sort;

import java.util.*;

/**
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * ex ) 118372 =>  873211
 */


public class question4 {
    public static void main(String[] args) {
        int a = 118372;

        String[] arr = String.valueOf(a).split("");

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< arr.length; i++){
            sb.append(arr[i]);
        }
        System.out.println(sb);

        // int => String String.valueof(a)
        // String => int Integer.parseInt(a)
        // 내림차순  Arrays.sort(array, Collections.reverseOrder());
    }
}
