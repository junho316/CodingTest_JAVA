class Solution {
    public int[] solution(int[] numbers, String direction) {
        int nl = numbers.length;
        int[] answer = new int[nl];
        int temp = 0;
        
        if(direction.equals("right")){
            temp = numbers[nl-1];
            for(int i = nl - 1; i > 0; i--){
                answer[i] = numbers[i-1];
            }
            answer[0] = temp;
        }else{
            temp = numbers[0];
            for(int i = 0; i < nl - 1; i++){
                answer[i] = numbers[i+1];
            }
            answer[nl-1] = temp;
        }
        return answer;
    }
}