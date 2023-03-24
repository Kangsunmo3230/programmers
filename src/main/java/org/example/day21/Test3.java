package org.example.day21;


import java.util.Locale;

/*
            JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
            단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
            문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class Test3 {
    public static void main(String[] args) {
        String s = "abc dedf b1";
        StringBuffer sb = new StringBuffer();
        s = s.toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' ') sb.append(" ");
            else if(s.charAt(i - 1) == ' ')
                sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
