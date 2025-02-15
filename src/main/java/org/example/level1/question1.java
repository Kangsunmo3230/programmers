package org.example.level1;

/**
 * 문자열을 정수로 바꾸기
 */
public class question1 {
    public static void main(String[] args) {
        String s = "1234";

       int answer = Integer.parseInt(s);

        /**Integer 클래스는?
         * Integer은 int를 감싸는 클래스이다.
         * int는 원시 타입 이지만 Integer은 객체타입이다.
         *
         *
         */
        //parseInt는 문자열을 int 타입으로 변환해준다.



        System.out.println(answer);

    }
}
