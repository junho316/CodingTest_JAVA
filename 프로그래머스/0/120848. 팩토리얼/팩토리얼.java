class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int cnt = 0;
        
        while( num <= n){
            cnt = cnt + 1;
            num = num * cnt;
        }
        answer = cnt - 1;
        return answer;
    }
}