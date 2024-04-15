class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = 1;
        int nl = numbers.length; 
        if (k != 1){
            n = 2*(k-1);
        }
   
        while (n > nl){
            n = n - nl;
        }
        
       
        
        System.out.print(n);
        
        answer = numbers[n]; 
             
        return answer;
    }
}