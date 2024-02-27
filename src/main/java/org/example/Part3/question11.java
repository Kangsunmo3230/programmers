package org.example.Part3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 과호가 바르게 짝지어졌다는 것은 "("문자로 열렸으면 반드시 짝지어서 ")" 문자로 닫혀야 한다는 뜻입니다.
 * <p>
 * "()()" 또느 ㄴ"(())()"는 올바른 괄호이다.
 * "(" 또는 ")"로만 이루어진 문자열 s가 주어졌을 때 문자열 s가 올바른 괄호이면 true 하고
 * 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성하세요.
 */
public class question11 {
    public static void main(String[] args) {

        String s = "()()((())";

        //스택으로 했을 경우
        // 1.첫 경우 에 ) 이면 false;
        // 2.( ( 만 넣는다
        // 3. ) 를 만나면 pop => 없으면 false
        Stack<String> st = new Stack<>();
        String[] array = s.split("");
        boolean result = true;
//        for (int i = 0; i < array.length; i++) {
//            if(st.empty()){
//                if(array[i].equals(")")){
//                    result = false;
//                }else{
//                    st.push(array[i]);
//                }
//            }else{
//                if(array[i].equals("(")){
//                    st.push(array[i]);
//                }else{
//                    st.pop();
//                }
//            }
//        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(String.valueOf(s.charAt(i)));
            } else if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    result = false;
                }
                st.pop();
            }
        }

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        if(!st.empty()){
           result = false;
       }

        System.out.println(result);

        //큐
        // '(

    }
}
