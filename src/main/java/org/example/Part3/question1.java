package org.example.Part3;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        //N개의 숫자가 공백 없이 써 있다. 이숫자를 모두 합해 출력하는 프로그램을 작성하시오.

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

       String sNum = sc.next();

        System.out.println("N=>"+ N);
        System.out.println("sNum=>"+ sNum);
        //string char로 변환하기

        char[] scahr = sNum.toCharArray();
        //개수만큼 더하기
        int sum =0;
        for(int i= 0; i< scahr.length; i++){
            System.out.println(scahr[i]);
             sum += scahr[i] - '0'; //char를 정수형(int)로 변환
        }
        System.out.println(sum);

    }
}
