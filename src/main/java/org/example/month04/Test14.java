package org.example.month04;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test14 {
    public static void main(String[] args) {
        int[] temp = new int[100]; //작업의 개수는 100개 이하이므로 100으로 선언
        int day = 0; //temp에 적용할 배포일 수

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        //각 항목마다 100까지 검사해야하므로 for문안에 while문이 들어간다.
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            System.out.println("day=>" + day);
            temp[day]++;
        }

        int count = 0;
        for (int n : temp) {
            if (n != 0) {
                System.out.println(n);
                count++;
            }
        }
        int[] answer = new int[count]; //답을 리턴하기 위한 배열 answer 선언

        count = 0; //count 0 초기화
        for(int n : temp){
            if(n != 0){
                answer[count++] = n; //answer 배열에 temp 값 넣기
            }
        }
    }
}
