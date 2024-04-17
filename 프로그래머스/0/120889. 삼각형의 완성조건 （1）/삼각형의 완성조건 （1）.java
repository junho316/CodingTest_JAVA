import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int temp;
        
        // for (int i = 0; i <= 2 ; i++){
        //     for (int j = 0; j <= 2 ; j++){
        //         if( sides[i] < sides[j]){
        //             temp = sides[i];
        //             sides[i] = sides[j];
        //             sides[j] = temp;
        //         }    
        //     }    
        // }
        Arrays.sort(sides);
        if(sides[2] >= sides[0] + sides[1]){
            answer = 2;
        }else{
            answer = 1;
        }
        return answer;
    }
}