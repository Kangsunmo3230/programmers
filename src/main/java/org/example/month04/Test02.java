package org.example.month04;


import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        //1149
        int[] answer = {};
        Map<String, Integer> arrayMap = new HashMap<>();
        Map<String, Integer> car = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            String record[] = records[i].split(" ");   // 06:00 / 0000 / IN
            String hours[] = record[0].split(":");

            String carNubmer = record[1];
            int hour = Integer.parseInt(hours[0]);
            int time = Integer.parseInt(hours[1]);
            int total = hour * 60 + time;
            if (arrayMap.containsKey(record[1])) {
                if (record[2].equals("IN")) {
                    arrayMap.put(carNubmer, arrayMap.get(carNubmer) - total);
                } else {
                    arrayMap.put(carNubmer, arrayMap.get(carNubmer) + total);
                }
            } else {
                arrayMap.put(carNubmer, -total);
            }

            if (record[2].equals("IN")) {
                car.put(carNubmer, 0);
            } else {
                car.remove(carNubmer);
            }

        }
        for (String key : car.keySet()) {
            arrayMap.put(key, arrayMap.get(key) + 1439);
        }

        int[] result = new int[arrayMap.size()];
        int index = 0;
        for (String key : arrayMap.keySet()) {
            System.out.println(key);
            if (arrayMap.get(key) <= fees[0]) {
            result[index] = fees[1];
            } else {
                double a = Math.ceil((arrayMap.get(key)-180)/ (double)fees[2]);
                result[index] = (int) (a * fees[3] +fees[1]);
            }
            index++;
        }
        System.out.println(Arrays.toString(result));
    }
}
