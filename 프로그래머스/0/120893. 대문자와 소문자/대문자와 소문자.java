import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char temp;
        ArrayList<Character> arrList = new ArrayList<Character>();
        
        for( int i = 0; i < my_string.length(); i++){
            temp = my_string.charAt(i);
            if(temp > 90){
                arrList.add((char)(temp - 32));     
            }else{
                arrList.add((char)(temp + 32)); 
            }
             answer = answer + arrList.get(i);
        }
        
        return answer;
    }
}