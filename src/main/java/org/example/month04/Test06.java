package org.example.month04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test06 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] cmpletion = {"eden", "kiki"};

        Map<String, Integer> map = new HashMap<>();
        List<String> array = new ArrayList<>();
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < cmpletion.length; j++) {
                if (participant[i].equals(cmpletion[j])) {

                }
            }
        }


    }
}
