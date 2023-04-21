package org.example.month04;

//가장 큰 수
/*
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test07 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 61, 610};
        // 3 61  1 600
        // 61 1 600 3
        // 61 600 3 1

        String[] arr = new String[numbers.length];
        // 10 9
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        String a = "61";
        String b = "610";
        // 60 30
        System.out.println("@@@" +  a.compareTo(b));
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("o1=>"+ o1);
                System.out.println("o2=>"+ o2);
                System.out.println((o2+o1).compareTo(o1+o2));
                return (o2+o1).compareTo(o1+o2);
            }
        });

        //Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        System.out.println(Arrays.toString(arr));
    }
}
