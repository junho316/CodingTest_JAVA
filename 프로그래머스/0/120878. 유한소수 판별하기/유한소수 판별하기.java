class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int temp = 2;
       
        while(temp <= b/2){
            if(a%temp ==0 && b%temp == 0){
                a = a / temp;
                b = b / temp;
            } else {
                temp = temp +1;
            }
        }
        
        if (a%b == 0 && b % b == 0){
            a = a/b;
            b = b/b;
        }
        if (a%a == 0 && b % a == 0){
            b = b/a;
            a = a/a;
        }
        
        boolean temp2 = true;
        while(temp2){
            System.out.println(b);
            if(b%2 == 0){
                b = b / 2;
            } else if(b%5 == 0){
                b = b / 5;
            } else {
                if(b != 1){
                    answer = 2;
                }
                temp2 = false;
            }
        }
        return answer;
    }
}