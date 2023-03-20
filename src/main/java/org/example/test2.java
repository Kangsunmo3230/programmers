package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

/*
        문자열
         s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
        str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
        예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 */
public class test2 {
    public test2() {
        super();
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";

        String[] array = str.split(" ");
        Integer maxValue = Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .max()
                .orElseThrow(NoSuchElementException::new);

        Integer minValue = Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .min()
                .orElseThrow(NoSuchElementException::new);
        String answer = minValue + " " + maxValue;

        System.out.println(answer);

    }
}
