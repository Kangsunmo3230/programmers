package org.example.Part3;


import java.util.Stack;

/**
 * 프로그래머스 주식가격
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 떄, 가격이 떨어지지 않은 기간이 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 * <p>
 * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 * prices의 길이는 2이상 100,000 이하입니다
 * <p>
 * ㅑ
 */
public class question10 {
    public static void main(String[] args) {
        int prices[] = {1, 2, 3, 2, 3,}; // return [4,3,1,1,0];
        //ex) [3,5,5,4,1] => [3,3,2,0,0]
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack();
//        System.out.println(stack.peek());
//        System.out.println(prices[stack.peek()]);
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { //스택이 비어있지 않고 + 가격이 떨어졋다
                ans[stack.peek()] = i - stack.peek();
                stack.pop(); // 답을 구했기 때문에 stack에서 제거한다
            }
            stack.push(i);
        }
        System.out.println(stack.toString());
    //5 < 7
        //[0 ,


    }
}
