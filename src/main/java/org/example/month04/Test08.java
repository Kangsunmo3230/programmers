package org.example.month04;


/*
선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.

예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.

위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다.
 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.

선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test08 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};


        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();
        String a = "BACDE";
         a  = a.replaceAll("[^" + skill + "]", "");
        System.out.println(a);
//        while (it.hasNext()) {
//            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//                it.remove();
//            }
//        }

        String[] skills = skill.split("");

        int answer = 0;
        for (int j = 0; j < skill_trees.length; j++) {
            String[] array = skill_trees[j].split("");  //BACDE
            int index = 0;
            boolean success = true;

            for (int i = 0; i < array.length; i++) {
                if (skill.contains(array[i])) {
                    System.out.println("array[i]=>" + array[i]);
                    if (skills[index].equals(array[i])) {
                        index++;
                    } else {
                        success = false;
                        break;
                    }
                }
            }
            if(success) answer ++;
        }
    }
}
