class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int j = 2; j <= n; j++){
            int i = 2;
            
            while(i*i <= j){
                if(j % i == 0){
                    answer = answer + 1;
                    break;   
                }
                i = i + 1;
            }
        }
    
        
        return answer;
    }
}