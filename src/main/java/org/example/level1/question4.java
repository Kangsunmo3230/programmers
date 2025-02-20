package org.example.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 내림차순으로 배치하기
 */
public class question4 {
    public static void main(String[] args) {

        long n = 118372;
        // long을 string 배열로 만들기
        String [] list = String.valueOf(n).split("");

        // 1. string 배열로 만들기
        //ex) [1,1,8,3,7,2];
        //String strN = String.valueOf(n);
        String strN = n + "";
        String[] arrayN = strN.split("");
        System.out.println(Arrays.toString(arrayN));

        // 2. 배열 정렬하기
        Arrays.sort(arrayN, Collections.reverseOrder());
        System.out.println("정렬된 배열 값 =>" + Arrays.toString(arrayN));

        // 3. 배열 string으로 변환
        //String strN2 =   String.join("", arrayN);
        StringBuilder sb = new StringBuilder();
        for (String word : arrayN) {
            sb.append(word);
        }
        //StringBuilder String으로 치환
        String str2 = sb.toString();

        long result = Long.parseLong(str2);

        System.out.println(result);


    }
}
