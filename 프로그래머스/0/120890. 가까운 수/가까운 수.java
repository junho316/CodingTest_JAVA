import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] arr = new int[array.length];
     
        for (int i = 0; i < array.length; i++){
            if(array[i] > n){
                arr[i] = array[i] - n;
            }else{
                arr[i] = n - array[i];
            }
        }
            
        int min = 0;
        
        for (int i = 1; i < array.length; i++){       
            if(arr[min] > arr[i]){      
                min = i ;         
            } else if(arr[min] == arr[i]){
                if(array[min] > array[i]){
                    min = i;      
                }         
            }
        }
        answer = array[min];
        return answer;
    }
}