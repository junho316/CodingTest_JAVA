class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        while( n <= box[0]){
            num1 = num1 + 1;
            box[0] = box[0] - n;
        }
        while( n <= box[1]){
            num2 = num2 + 1;
            box[1] = box[1] - n;
        }
        while( n <= box[2]){
            num3 = num3 + 1;
            box[2] = box[2] - n;
        }
        
        answer = num1*num2*num3;
        return answer;
    }
}