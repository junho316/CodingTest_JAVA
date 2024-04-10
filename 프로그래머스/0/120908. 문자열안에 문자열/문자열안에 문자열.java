import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int str2Len = str2.length();
        int str1Len =  str1.length(); 
        String temp;
        
        int cnt = 0;
        while( str1Len >= str2Len){
            temp = str1.substring(cnt,(cnt + str2Len));            
            if (temp.equals(str2)){
                answer = 1;
            }
            str1Len--;
            cnt++;
        } 
        return answer;
    }
}