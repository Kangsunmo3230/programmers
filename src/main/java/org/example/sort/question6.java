package org.example.sort;

import java.io.IOException;
import java.util.Arrays;

/**
 * 완전탐색 > 카펫
 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
 */


public class question6 {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow; // 전체 타일의 개수

        for (int height = 3; height <= total; height++) { // 최소 높이는 3부터
            if (total % height == 0) { // 전체 넓이가 나누어 떨어질 때만
                int width = total / height; // 가로 길이 계산

                // 갈색 타일이 테두리를 이루는 조건 확인
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[] { width, height }; // [가로, 세로]
                }
            }
        }

        return new int[] {}; // 조건을 만족하는 경우는 항상 존재하므로 이 부분은 실행되지 않음
    }

    public static void main(String[] args) {
        question6 carpet = new question6();

        // 예제 테스트
        int[] result1 = carpet.solution(10, 2);
        System.out.println("Result1: " + result1[0] + ", " + result1[1]);

        int[] result2 = carpet.solution(8, 1);
        System.out.println("Result2: " + result2[0] + ", " + result2[1]);

        int[] result3 = carpet.solution(24, 24);
        System.out.println("Result3: " + result3[0] + ", " + result3[1]);
    }
}
