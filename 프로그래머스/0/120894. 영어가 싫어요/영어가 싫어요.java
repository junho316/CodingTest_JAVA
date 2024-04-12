import java.util.*;
class Solution {
    public long solution(String numbers) {
        
        HashMap<String,String> map = new HashMap<String,String>(){{
            put("zero","0");
            put("one","1");
            put("two","2");
            put("three","3");
            put("four","4");
            put("five","5");
            put("six","6");
            put("seven","7");
            put("eight","8");
            put("nine","9");
        }};
        
        long answer = 0;
        char charTemp;
        String strTemp = "";
        String strAnswer = "";
        for(int i = 0; i < numbers.length(); i++){
            charTemp = numbers.charAt(i);
            strTemp = strTemp + charTemp;
            for(String j: map.keySet()){
                if(j.equals(strTemp)){ 
                    strAnswer = strAnswer + map.get(j);
                    strTemp = "";
                }    
            }
        }
        
        answer = Long.parseLong(strAnswer);
        return answer;
    }
}