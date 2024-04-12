import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String str1, str2;
        ArrayList<String> arrList = new ArrayList<String>();
        str1 = my_string.substring(num1,num1+1);
        str2 = my_string.substring(num2,num2+1);
        
        for (int i = 0; i < my_string.length(); i++){   
            arrList.add(my_string.substring(i,i+1));
        }
        arrList.set(num1,str2);
        arrList.set(num2,str1);
    
        answer = String.join("",arrList);
        return answer;
    }
}