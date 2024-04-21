class Solution {
    public int[] solution(int n) {
        double num1 = n;
        int num2 = (int)Math.ceil(num1 / 2);
        int[] arr = new int[num2];    
        int oddCnt = 0;

        
        for(int i = 1; i <= n; i++){
                if(i%2 != 0){    
                    arr[oddCnt] = i;
                    oddCnt++;
                    
                }     
        }
    
        return arr;
    }
}