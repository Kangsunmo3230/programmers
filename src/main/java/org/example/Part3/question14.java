package org.example.Part3;
//카트 게임

import java.util.LinkedList;
import java.util.Queue;

/**
 * N장의 카드가 있따.
 * 각각의 카드는 차례대로 1에서 N까지의 번호가 부ㅡㅌ어 있으며, 1번 카드가 가장 위, N번카드가 가장 애린 상태로 놓여있다.
 * 1번 가장 위에 있는 카드를 바닥에 버린다
 * 2번 가장 위에 있는 카드를 맨 아래로 옮긴다.
 * 1번 2번 반복
 */


public class question14 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        //1 큐 선언
        //2 큐에 넣는다 [6,5,4,3,2,1]
        //3 1번 버린다 poll
        //4 2번 버리고 다시 넣는다.
        //5

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            queue.offer(array[i]);
        }
        while (queue.size() > 1) {
             queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.peek());
    }
}
