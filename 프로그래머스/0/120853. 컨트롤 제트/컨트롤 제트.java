import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String temp;

        String[] sArr = s.split("\\s");

        for(int i = 0; i < sArr.length; i++){
     
            if(sArr[i].equals("Z")){
                answer = answer - Integer.parseInt(sArr[i-1]);
            } else {
                answer = answer + Integer.parseInt(sArr[i]);
            }
        }
        return answer;
    }
}