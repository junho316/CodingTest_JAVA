class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int osLength = overwrite_string.length();
        String front = my_string.substring(0, s);
        String back = my_string.substring(s+osLength, my_string.length());
        
        answer = front + overwrite_string + back;
        
        return answer;
    }
}