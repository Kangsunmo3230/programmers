package org.example;

public class Test5 {
    boolean solution(String str) {
        String s = "(()(";
        char[] charArr = s.toCharArray();

        int sum = 0;
        for (int k : charArr) {
            if (k == '(') {
                sum += 1;
            } else {
                sum -= 1;
            }
            if (sum < 0) return false;
        }
        return sum == 0;
    }

}
