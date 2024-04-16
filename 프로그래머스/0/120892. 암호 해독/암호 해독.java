import java.util.*;
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        ArrayList<String> arrList = new ArrayList<String>();
        
        for (int i = code-1; i < cipher.length(); i = i + code){
            arrList.add(cipher.substring(i,i+1));    
        }
        
        answer = String.join("", arrList);
        return answer;
    }
}