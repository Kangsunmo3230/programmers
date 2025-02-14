package org.example.level1;

/**
 * 약수의 합
 */
public class question2 {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            System.out.println(i);
            if(n % i == 0 ){
                answer += i;
            }
        }
        System.out.println("약수의 합 =>" + answer);


    }
}
