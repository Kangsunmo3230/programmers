package org.example.Part3;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 세준이는 기말고사를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다.
 * 일단 세준이는 자기 점수 중 최댓값을 골랐다. 그런 다음 최댓값을 M이라 할 떄 모든 점수를 점수 /M*100으로 고쳤다.
 * 예를 들어 세준이의 최고점이 70점 수학점수 가 50점이라면 수학 점수는 50/70*100이므로 71.43점이다.
 * 세준이의 성적을 이 방법으로 계산했을 떄 새로운 평균을 구하는 프로그램을 작성하시오.
 */
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        //배열로 담는다
        int[] array = new int[n];
        for(int i=0; i< n; i++){
            array[i] = sc.nextInt();
        }
//        inat = a =

        int max = Arrays.stream(array).max().getAsInt();
        int sum = 0;
        for(int i= 0; i< n; i++){
            int value = array[i] / max *100;
            sum += value;
        }
        System.out.println("평균 값은 => " +  sum/n);

    }
}
