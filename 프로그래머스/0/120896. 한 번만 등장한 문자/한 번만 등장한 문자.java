import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        ArrayList<String> arrList = new ArrayList<String>();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++){
            arrList.add(s.substring(i,i+1));
            arr.add(s.substring(i,i+1));
        }
        Collections.sort(arr);
        for(int i = 0; i < arrList.size(); i++){
            for( int j = i + 1; j < arrList.size(); j++){
                if( arrList.get(i).equals(arrList.get(j))){
                    while (arr.remove(String.valueOf(arrList.get(i)))) {};
                    break;
                }       
            }        
        }

        answer = String.join("", arr);
        return answer;
    }
}