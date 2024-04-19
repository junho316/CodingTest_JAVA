import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {        
        ArrayList<String> arrList = new ArrayList<String>();
        
        int temp = 0;
        while( temp < my_str.length()){
            if( temp + n < my_str.length()){
                arrList.add(my_str.substring(temp,temp+n));    
            }else{
                arrList.add(my_str.substring(temp));            
            }
            temp += n;
        }
        int cnt = 0;
        String[] answer = new String[arrList.size()];
        for(String strTemp: arrList){
            answer[cnt++] = strTemp;
        }
        return answer;
    }
}