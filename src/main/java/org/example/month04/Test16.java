package org.example.month04;

import java.util.*;

public class Test16 {
    public static void main(String[] args) {

        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        // 1 2 2 3 3 4 5 5
        int k = 6;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            if (map.get(tangerine[i]) != null) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                map.put(tangerine[i], 1);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());


        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });


        int answer = 0;
        for (int key : keySet) {
            answer ++;
            k -= map.get(key);
            if(0 >= k){
                break;
            }
        }
        System.out.println(answer);

    }
}
