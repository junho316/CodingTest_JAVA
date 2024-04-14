import java.util.*;
class Solution {
    public String solution(String letter) {
        
        String answer = "";
        int count = 0;
        String code[] = letter.split(" ");
        
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String, Character> map = new HashMap<String, Character>();
        
        for (char i = 'a'; i <= 'z'; i ++){
            map.put( morse[count], i);
            count = count +1;
        }
     
        for (int i = 0; i < code.length; i++){
            for(String key:map.keySet()){
                if (code[i].equals(key)){
                   
                    code[i] = Character.toString(map.get(key)); 
                }
            }
        }
        
        answer =  String.join("",code); 
        
        return answer;
    }
}