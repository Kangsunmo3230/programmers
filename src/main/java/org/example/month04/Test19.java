package org.example.month04;

//큰 수 만들기

import java.util.ArrayList;
import java.util.List;

public class Test19 {
    public static void main(String[] args) {
        String number = "15973";
        int k = 2;

        String[] array = number.split("");
        StringBuffer sb = new StringBuffer("");
        int n = 0;
        for (int i = 0; i < array.length-k; i++) {
            int max = 0;
            for (int j = n; j <=  k + i; j++) {
                if (max < Integer.parseInt(array[j])) {
                    max = Integer.parseInt(array[j]);
                    n = j + 1;
                }
            }
            sb.append(max);
            System.out.println("max => " + max);
        }
    }
}
