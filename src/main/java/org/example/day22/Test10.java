package org.example.day22;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.

예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만
 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.

사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 */
public class Test10 {

    //boxed() => intStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입으로 전환하여 전용으로 실행 가능한 기능을 수행하기 위해 존재함.
    public static void main(String[] args) {
        int[] people = {70, 50, 50, 80, 50, 100};
        int limit = 100;
        int min = 0;
        int answer = 0;
        Arrays.sort(people);
        //50 50 50 70 80 100
        // max = 5 min  = 0
        for (int max = people.length - 1; min <= max; max--) {
            System.out.println(max + " / " + min);
            System.out.println(people[max] + " / " + people[min]);
            // max =5 min =0  50 100 <= 100 answer = 1
            // max =4 min =0  50 80  <= 100 answer = 2
            // max =3 min =0  50 70  <= 100 answer = 3
            // max =2 min =0  50 50 <=  100 answer = 4 min ++; min = 1 max= 1
            if (people[min] + people[max] <= limit) {
                min++;
                System.out.println("@@@@" + min);
            }
            answer++;
        }
        System.out.println(answer);
    }
}
