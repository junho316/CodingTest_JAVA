import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        ArrayList<String> arrList = new ArrayList<String>();
        
        for (int i = 1; i <= my_string.length(); i++){
            arrList.add(my_string.substring(i-1,i));
        }
        
        
        for (int i = arrList.size()-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arrList.get(i).equals(arrList.get(j))){
                    arrList.remove(i);
                    break;
                }   
            }     
        }
        
        //System.out.print(arrList.toString());
        answer = String.join("",arrList);
        return answer;
    }
}