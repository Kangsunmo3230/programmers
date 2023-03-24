package org.example.day22;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
△△ 게임대회가 개최되었습니다. 이 대회는 N명이 참가하고, 토너먼트 형식으로 진행됩니다. N명의 참가자는 각각 1부터 N번을 차례대로 배정받습니다. 그리고, 1번↔2번, 3번↔4번, ... , N-1번↔N번의 참가자끼리 게임을 진행합니다.
각 게임에서 이긴 사람은 다음 라운드에 진출할 수 있습니다.
 이때, 다음 라운드에 진출할 참가자의 번호는 다시 1번부터 N/2번을 차례대로 배정받습니다.
 만약 1번↔2번 끼리 겨루는 게임에서 2번이 승리했다면 다음 라운드에서 1번을 부여받고, 3번↔4번에서 겨루는 게임에서 3번이 승리했다면 다음 라운드에서 2번을 부여받게 됩니다.
 게임은 최종 한 명이 남을 때까지 진행됩니다.

이때, 처음 라운드에서 A번을 가진 참가자는 경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 궁금해졌습니다.
 게임 참가자 수 N, 참가자 번호 A, 경쟁자 번호 B가 함수 solution의 매개변수로 주어질 때,
  처음 라운드에서 A번을 가진 참가자는 경쟁자로 생각하는 B번 참가자와 몇 번째 라운드에서 만나는지 return 하는 solution 함수를 완성해 주세요.
 단, A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정합니다.
 */
public class Test11 {

    public static void main(String[] args) {
        int n = 8;

        int a = 4;
        int b = 7;
        int answer = 3;
        // 1 2 3 4 5 6 7 8
        //  1   2   3   4
        //    1      2
//        int[] list = new int[n];

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < n + 1; i++) {
            list.add(i + 1);
        }
        // 2 3 4 5 6 7 8 9
        int round = 1;
        while (true) {
            if (round == 4) {
                break;
            }
            if (list.get(a-1 / round) / 2 == list.get(b-1 / round) / 2) {
                break;
            }
            for(int i=0; i< list.size(); i++){
                list.set(i, list.get(i) / 2);
            }

            for(int i=0; i< list.size(); i++){
                System.out.println("@@"+list.get(i));
            }
            //중복 제거
            list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
            System.out.println(list);
            round++;
        }

    }
}
