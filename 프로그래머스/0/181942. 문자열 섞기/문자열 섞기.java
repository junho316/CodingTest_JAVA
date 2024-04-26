import java.util.*;
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        ArrayList<String> temp1 = new ArrayList<String>();
        ArrayList<String> temp2 = new ArrayList<String>();
        
        for (int i = 0; i < str1.length(); i++){
            temp1.add(str1.substring(i, i+1));
        }
        for (int i = 0; i < str2.length(); i++){
            temp2.add(str2.substring(i, i+1));
        }
        
        for (int i = 0; i < temp1.size(); i++){
            answer += temp1.get(i) + temp2.get(i); 
        }
        
        return answer;
    }
}