package org.example.day23;


import java.util.Arrays;

/*
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다.
정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때
 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.드에서 만나는지 return 하는 solution 함수를 완성해 주세요.
 단, A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정합니다.
 */
public class Test12 {

    public static void main(String[] args) {
        // 1 2    1 2 3 6   1 2 4 8   1 2 7
        // 2   6  8  7
        int[] arr = {1,2,3};
        int answer = 1;
        //2 1 3 4 7
        Arrays.sort(arr);
        int a = 2;
        int total = 1;
        while (a < arr[arr.length - 1]) {

            int length = 0;
            for (int i = 0; i < arr.length; i++) {
                System.out.println("@@@=>"+arr[i]);
                if (arr[i] % a == 0) {
                    //다 나누어지는지 확인
                    length++;
                }
            }
            //다 나누어진다면
            if (length == arr.length) {
                total *= a;
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arr[j] / a;
                }
            }
            a++;

        }

            for(int i=0; i< arr.length; i++){
              answer *=  arr[i];
            }
            answer = answer*total;
        System.out.println(answer);
    }
}
