package org.example.Part3;

import java.util.Arrays;
import java.util.Collections;

public class question5 {
    public static void main(String[] args) {


        /**
         * 1번쨰 줄에 재료의 개수 N , 2번쨰 줄에 갑옷을 만드는데 필요한 M
         * 3번쨰 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 나타난다.
         * ex) N = 6, M =9
         * 재료들 2 7 4 1 5 3
         */

        int n = 6;
        int m = 9;

        int[] array = {2, 7, 4, 1, 5, 3};
        Arrays.sort(array); //오름차순 정렬 // 1 2 3 4 5 7
        //배열을 돌면서 2개의 합이 m(9) 가되면

        // sum < m s++
        // sum = m s++ e--
        // sum > m e--
        int s = 0; int e = 5;
        int count = 0;
        while(s < e){
            if(array[s] + array[e] < m){
                s++;
            }else if(array[s] + array[e] == m){
                s++; e--;
                count++;
            }else{
                e--;
            }
        }
        System.out.println(count);

        /*        int 배열 내림차순 하는 법
         *        Integer [] arr3 = Arrays.stream(array).boxed().toArray(Integer[] :: new);
         *        Arrays.sort(arr3, Collections.reverseOrder());
         */

    }
}
