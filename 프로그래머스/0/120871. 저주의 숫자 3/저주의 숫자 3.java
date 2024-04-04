class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean bool = true;
        for(int i = 1;i <= n; i++){
            while(bool)   {
                if(answer % 3 == 0 || Integer.toString(answer).contains("3")){
                    answer = answer + 1;
                }else{
                    answer = answer+1;
                    bool = false;
                }
            }
            bool = true;
        }
        answer -= 1;
        return answer;
    }
}