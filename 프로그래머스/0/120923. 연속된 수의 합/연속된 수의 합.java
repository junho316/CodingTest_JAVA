class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        for(int i = -100; i <= total; i++){
            int temp = 0;
            int result = 0;
            
            while(temp < num){
                result = result + i+ temp;
                temp++;
            }
            
            if (result == total){
                for(int j = 0; j < num; j++){
                    answer[j] = i+j;
                } 
            }

        }
        
        return answer;
    }
}