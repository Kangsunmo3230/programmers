package org.example.month04;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Test12 {
    public static void main(String[] args) {
        String[][] colothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        //Map
        // 모자 빨간 , 모자 파랑 , 모자
        HashMap<String, Integer> hashMap = new HashMap<>();




        for (int i = 0; i < colothes.length; i++) {
            hashMap.put(colothes[i][1], hashMap.getOrDefault(colothes[i][1], 0) + 1);
        }
        int total = colothes.length;

        //getOrDefault
        //for(String [] clothes : colothes)

    }
}
