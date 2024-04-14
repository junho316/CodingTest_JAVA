class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = new String[rsp.length()];
        for(int i = 0; i < rsp.length(); i++){
            arr[i] = rsp.substring(i,i+1);
            System.out.print(arr[i] +"\n");
        }
    
        for(int i = 0; i <rsp.length(); i++){
            if(arr[i].equals("0")){
                arr[i] = "5";
            } else if(arr[i].equals("2")){
                arr[i] = "0";
            } else {
                arr[i] = "2";
            }
            
        }
    
         answer = String.join("", arr);
         
        return answer;
    }
}