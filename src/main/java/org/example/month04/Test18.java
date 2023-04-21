package org.example.month04;

//같은 숫자는 싫어


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test18 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        Stack<Integer> st = new Stack<>();
        List<Integer> array = new ArrayList<>();

        for (int n : arr) {
            if (st.empty()) {
                st.push(n);
                array.add(n);
            } else {
                if(st.peek() != n){
                    st.push(n);
                    array.add(n);
                }
            }
        }

        int [] answer = array.stream().mapToInt(i -> i).toArray();
        System.out.println(array.toString());

    }
}
