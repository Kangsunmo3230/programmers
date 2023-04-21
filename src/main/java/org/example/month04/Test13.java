package org.example.month04;

//전화번호 목록


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if(phone_book[j].startsWith(phone_book[i])){
                    answer=  false;
                    break;
                }
                if(phone_book[i].startsWith(phone_book[j])){
                    answer=  false;
                    break;
                }
            }
        }

        LinkedList<String> a = new LinkedList<>();

        List<String> list = Arrays.asList("hello", "gglee", "java");
    }
}
