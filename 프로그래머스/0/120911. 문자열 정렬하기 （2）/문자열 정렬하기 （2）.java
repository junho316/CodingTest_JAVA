import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int temp;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 0; i < my_string.length(); i++){
            temp = my_string.charAt(i);
            if( temp < 96 ){
                temp += 32;     
            }
            arrList.add(temp);
        }
        Collections.sort(arrList);

        for(int i = 0; i < arrList.size(); i++){
            temp = arrList.get(i);    
            answer += (char)temp;
        }
        
        return answer;
    }
}