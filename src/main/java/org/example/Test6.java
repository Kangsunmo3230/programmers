package org.example;


/*
Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다.
예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

제한사항
 */

public class Test6 {

    public int abc(int n) {

        int answer = 0;
        Loop1:
        for (int i = 1; i < n + 1; i++) {
            int sum = 0;
            Loop2:
            for (int j = i; j < n + 1; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break Loop2;
                } else if (sum > n) {
                    break Loop2;
                }
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Test6 test = new Test6();
        int reuslt = test.abc(15);
        System.out.println(reuslt);
    }
}


