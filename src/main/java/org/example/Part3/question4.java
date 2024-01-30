package org.example.Part3;

//투포인터
//연속된 자연수의 합 구하기
//시간 복잡도 O(n)을 이용했다.
public class question4 {

    public static void main(String[] args) {
        int n = 15;
        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != n) {
            if (sum == n) {
                count++;
                end++;
                sum = sum + end;

            } else if (sum > n) {
                sum = sum - start;
                start++;
            } else {
                end++;
                sum = sum + end;
            }
        }
    }
}
