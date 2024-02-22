package org.example.retry;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 프래그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 떄 서비스에반여할 수 있습니다.
 * 또 , 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고 ,
 * 이떄 뒤에 있는 기능은 앞에 있는 기능이 배포될 떄 함꼐 배포된다.
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 떄 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록
 * solution 함수를완성하세요.
 */
public class question9 {
    public static void main(String[] args) {
        int progresses[] = {95, 90, 99, 99, 80, 99};
        int speeds[] = {1, 1, 1, 1, 1, 1};

        //큐 사용
        // add, offer 추가
        // poll => 첫번쨰 값을 반환하고 제거 비어있다면 null
        // remove 첫번쨰 값 제거
        //queue.peek();  가장 먼저 들어간 값 출력
        // clear 초기화
        // isEmpty 스택이 잇는지 boolean

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        int[] dev = new int[speeds.length];

        // 개발 완료까지 필요 일수 계산
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int day = 0;

            while (true) {
                progress += speeds[i];
                day++;
                if (progress >= 100) {
                    break;
                }
            }

            dev[i] = day;
            queue.offer(day);
        }
        System.out.println("는" + queue.toString());

        //하나 씩 뺴서 비교를 한다
        while (!queue.isEmpty()) { //스택이 없을떄까지 반복
            System.out.println(queue.toString());
            if (array.isEmpty()) {
                array.add(queue.peek());
                queue.remove();
            } else {

            }
        }

    }
}
