class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int weight = 0;
        int height = 0;
        for(int i = 1; i < dots.length; i++){
            if( dots[i-1][1] != dots[i][1]){  
                    weight = dots[i-1][1] - dots[i][1];                
            }   
            if( dots[i-1][0] != dots[i][0]){
                    height = dots[i][0] - dots[i-1][0];  
            }   
           
        }
        
        if(weight < 0){
            weight*=-1;
        }
        
        if(height < 0){
            height*=-1;
        }
        answer = weight*height;
        return answer;
    }
}