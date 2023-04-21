package org.example.month04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        String s = "01110";
        int number = 0;
        int remove = 0;


        while (s.length() > 1) {
            number ++;

            System.out.println("s=>"+ s);
            String newS = "";
            //0 제거하기
            for (char s2 : s.toCharArray()) {
                if (s2 != '0') newS += s2;
                else remove++;
            }
            System.out.println(Integer.toBinaryString(newS.length()));
            s = Integer.toBinaryString(newS.length());
            //이진 변환
        }
      int [] answer = {number,remove};
    }
}
