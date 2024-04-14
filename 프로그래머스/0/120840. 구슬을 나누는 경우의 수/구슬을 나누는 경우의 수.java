class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        Double i;
    
        Double num = 1.0;
        
        for (i = 1.0; i <= balls; i++){
            
            if (i > share){
                num = i * num;
            }
            if (i <= balls - share){
                num = num / i;
            }
        }
           
 
        answer = (int) Math.round(num);
        return answer;
    }
}