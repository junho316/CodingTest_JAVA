class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp;
        for(int i = 0; i < array.length; i++){
            temp = array[i];
            while (temp > 0 ){
                System.out.println(temp);
                if(temp%10 == 7){
                     answer = answer + 1;
                }
                temp = temp / 10;
               
            }
        }
        return answer;
    }
}