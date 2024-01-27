package org.example.Part3;

//구간 합 구하기
//1. 합 배열 공식 s[i] = s[i-1] + a[i]

//2. 구간 합 공식 s[j] - s[i-1]

import java.util.Scanner;

/**
 *  총 M개의 줄에 입력으로 주어진 i번쨰 수에서 j 번쨰 수까지의 합을 출력한다.
 */
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        //배열 생성
        int[] array = new int[length];
        //구간 합 배열 생성
        int [] sumArray = new int[length];
        System.out.println(sumArray[0]);
        //배열에 값 넣기
        for(int i= 1; i< length-1; i++){
            array[i] = sc.nextInt();
//            sumArray[i]  = sumArray[i-1] + array[i-1];
        }
        //확인 작업
        for(int i= 0; i< length; i++){
            System.out.println( array[i]);
            System.out.println( sumArray[i]);

        }
    }
}
