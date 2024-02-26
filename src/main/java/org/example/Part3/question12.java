package org.example.Part3;


//절대값 힙 구현하기

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/** 우선순위 큐 구현하기 */
public class question12 {
    public static void main(String[] args) {

        int array[] = {1,-1,0,0,0,1,1,-1,-1,2,-2,0,0,0,0,0,0,0};
        //여기서 들어와서
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first == second){
                return o1 > o2 ? 1 : -1; //음수 우선 정렬하기 즉 오름차순
            }else{
                return first - second; //절대값을 기준으로 오름차순 정렬
            }
        });
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        myQueue.add(4);
        myQueue.add(3);
        myQueue.add(2);
        myQueue.add(1);

        //원래대로라면 3,2,1 순서인대
        // 오름차순 정렬이면 => 1234
        System.out.println(queue);
        System.out.println(myQueue);

    }
}
/**
 * 우선순위 큐 선언
 *          PriorityQueue<Integer> queue1 = new PriorityQueue<>(); //오름차순 //1234
 *         PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder()); //내림차순 4321
 */