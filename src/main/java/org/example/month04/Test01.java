package org.example.month04;

/*
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
* */


public class Test01 {
    public static void main(String[] args) {
        int progresses[] = {93, 30, 55};
        int speeds[] = {1, 30, 5};
        int[] temp = new int[100]; //작업의 개수는 100개 이하이므로 100으로 선언
        int day = 0; //temp에 적용할 배포일 수

        //각 항목마다 100까지 검사해야하므로 for문안에 while문이 들어간다.
        for(int i=0; i<progresses.length; i++){
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            temp[day]++;
        }


        int count = 0;


        //temp에 들어간 배열의 길이를 알기위한 코드임.
        //temp는 초기에 0으로 선언되어 있으므로 0이 아닌 값만 측정하면 됨.
        for(int n : temp){//temp배열 값을 하나식 n에 적용
            if(n != 0){ //배열 값이 0이 아니라면
                count ++; //count 증가
            }
        }

        int[] answer = new int[count]; //답을 리턴하기 위한 배열 answer 선언

        count = 0; //count 0 초기화
        for(int n : temp){
            if(n != 0){
                System.out.println(n + "@");
                System.out.println(count);

                answer[count++] = n; //answer 배열에 temp 값 넣기
            }
        }
        for(int i=0; i< answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
