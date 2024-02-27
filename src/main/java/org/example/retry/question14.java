package org.example.retry;

import java.util.*;

/**
 * 오큰수 구하기
 * 크기가 N인 수열 A= A1,A2, ... AN 이 있다.. 수열의 각 원소 Ai에 대해서 오큰수 NEG(i)를 구하려고 한다. Ai의 오큰수는 오른쪽에 잇으면서 Ai보다 큰 수 중에서 가장 왼쪽에 잇는 수를 의미한다.
 * 그러한 수가 없는 경우 오큰수는 -1이다
 * 예를 들어 A = [3,5,2,7] NGE(1) = 5 , NGE(2) = 7
 */
public class question14 {
    public static void main(String[] args) {

        /**
         * 반복문을 돌려 자기 자신에서부터 오른쪽으로 이동시킨다
         * 자기 자신보다 크면 결과 배열에 넣은 후 더이상 오른쪽으로 이동시킨다.
         *
         * 자기 자신의 인덱스를 스택에 저장하고, 반복문을 통해 오른쪽으로 계속 이동시키다가 스택의 peek 값보다 큰 값이 나타나면
         * 스택 안에 저장되어 있는 모든 인덱스를 현자의 수로 치환
         */
        // 0 1 2 3
//        Queue<Integer> queue = new LinkedList<>();
//
        int array[] = {3, 5, 2, 7};
//
//        for (int i = 0; i < array.length; i++) {
//            queue.offer(array[i]);
//        }
//        while (!queue.isEmpty()) {
//            int compare = queue.poll();
//            Optional<Integer> a = queue.stream().filter(s -> s > compare).findFirst();
////            System.out.println(a);
//            if(a.isEmpty()){
//                System.out.println(-1);
//            }else{
//                System.out.println(a.get());
//            }
//
//        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {

        }

    }
}
