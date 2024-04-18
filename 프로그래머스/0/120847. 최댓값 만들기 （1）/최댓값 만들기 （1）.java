class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
        int len =  numbers.length;
        
        for( int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        answer = numbers[len-1]*numbers[len-2];
        return answer;
    }
}