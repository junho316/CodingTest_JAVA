class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int arr[] = new int[1000];
        
        for (int i = 0; i < array.length; i++) {
            for(int k = 0; k < 1000; k++){
                
                if (array[i] == k ) {
                    arr[k] = arr[k] + 1;  
                }
            } 
        }
        
        int max = arr[0];
        int num = 0;
        int num2 = 0;
        
        for(int l = 0; l < 1000; l++){
            if(arr[l] > max) {
                max = arr[l];
                num = l;
            }     
        }
        
        for(int q = 0; q < 1000; q++){
            if(arr[q] == max ) {
                num2 = num2 + 1;
            } 
        }
        
        if(num2 != 1){
            answer = -1;
        } else{
            answer = num;
        }
        
        return answer;
    }
}