import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        while(order >= 1){
            arrList.add(order % 10);
            order = order/10;
        }
        
        for(int i = 0; i < arrList.size(); i++){
            if(arrList.get(i).equals(3) || arrList.get(i).equals(6) || arrList.get(i).equals(9)){
                answer = answer+1;
            }
        }
        return answer;
    }
}