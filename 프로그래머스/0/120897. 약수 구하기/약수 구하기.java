import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            if(n%i == 0){
                arrList.add(i);
            }
        }
        int[] answer = new int[arrList.size()];
        int cnt = 0;
        for(int temp: arrList){
            answer[cnt++] = temp;
        }
        return answer;
    }
}