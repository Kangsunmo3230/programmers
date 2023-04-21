package org.example.day0407;


//개인정보 수집 유효기간

/*
* 고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다.
* 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다.
* 당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기해야 합니다.

예를 들어, A라는 약관의 유효기간이 12 달이고, 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다.
당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.

모든 달은 28일까지 있다고 가정합니다.

다음은 오늘 날짜가 2022.05.19일 때의 예시입니다.
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test17 {
    public static void main(String[] args) throws ParseException {
        String today = "2022.05.19";
        String [] terms = {"A 6", "B 12", "C 3"};
        String [] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date todayDate = formatter.parse(today);
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        for (String s : terms) {
            String[] term = s.split(" ");
            hashMap.put(term[0], String.valueOf(Integer.parseInt(term[1])));
        }

        for(String privac : privacies){
            String dateString = privac.substring(0,10);
            String unit = privac.substring(11,12);
            int plusMonth = Integer.parseInt(hashMap.get(unit));

            Date date = formatter.parse(dateString);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date);
            cal1.add(Calendar.MONTH ,plusMonth);

            String date2 = formatter.format(cal1.getTime());
            if(todayDate.before(cal1.getTime())){
                answer.add(Arrays.asList(privacies).indexOf(privac));
            }
            System.out.println(answer.stream().mapToInt(integer  -> integer).toArray());
        }
    }
}
