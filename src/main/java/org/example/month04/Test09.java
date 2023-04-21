package org.example.month04;

//소수 찾기

/*
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test09 {

    public static void main(String[] args) {
        String number = "1231234";
        int k = 3;
        String answer = "3234";

        List<Integer> array = new ArrayList<>();
        // 배열에서 1인 것을 모두 지울 수 잇을까
        //
        for (char n : number.toCharArray()) {
            array.add(Integer.parseInt(String.valueOf(n)));
        }

        //  1 2 3  1
        //
        int a = 0;
        String answer2 = "";
        for (int i = 0; i < 4; i++) {  //4개 함
            // 1 2 3 1 중에 맥스를 구함
            int max = 0;
            for (int j = a; j < i + k; j++) {
                if (array.get(j) > max) {
                    a = j+1;
                    answer2 += array.get(j);
                }
            }
        }


        Collections.sort(array, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            answer += array.get(i);
        }

    }
}
