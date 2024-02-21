package org.example.Part3;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 배열 arr 이 주어진다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다.
 * 이떄 , 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고한다
 * 단) ㅈ제거된 후 남은 수들을 반환할 떄는 배열 arr의 원소들의 순서를 유지해야 한다.
 * arr = [1,1,3,3,0,1,1] => [1,3,0,1]
 * arr = [4,4,4,3,3,] => [4,3]
 */
public class question8 {
    public static void main(String[] args) {
     // stack => [1,3,0,1]
        // queue = > first in first out =>
        int []arr = {1,1,3,3,0,1,1};
        Stack<Integer> st = new Stack<>();
        List<Integer> array = new ArrayList<>();



        for(int i =0; i< arr.length; i++){
           if(st.empty()){
               st.push(arr[i]);
               array.add(arr[i]);
           }else{
               if(st.peek() != arr[i]){
                   st.push(arr[i]);
                   array.add(arr[i]);

               }
           }
        }

        System.out.println(array);
        //배열로 만들어서 보내야 함
        //list를 배열로 변경
        int [] answer = array.stream().mapToInt(i -> i).toArray();

        System.out.println(answer);
    }
}
