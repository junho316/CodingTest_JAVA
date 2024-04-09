class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] arr = polynomial.split(" ");
        int sumInt = 0;
        int sumX = 0;
        String temp;
        for (int i = 0; i <arr.length; i++){
            if ( arr[i].contains("x")){
                if ( arr[i].charAt(0) != 'x'){
                    temp = arr[i].substring(0,arr[i].length()-1);
                    sumX = sumX+Integer.parseInt(temp);
                }else{
                    sumX++;
                }
                
                
            } else if(!arr[i].equals("+")){
                sumInt = sumInt +  Integer.parseInt(arr[i]);     
            }
        }

        if( sumInt == 0 ){
            if(sumX == 1){
                answer = "x";         
            }else{
                answer = sumX + "x";                    
            }
        } else if(sumX != 0 && sumInt != 0){
            if(sumX == 1){
                answer = "x + " + sumInt ;         
            }else{
            answer = sumX + "x + " + sumInt;         
            }     
        } else if(sumX == 0){
            answer = sumInt + "";        
        }
        
        return answer;
    }
}