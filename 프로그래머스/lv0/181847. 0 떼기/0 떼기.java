class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        char n_arr[] = n_str.toCharArray();
        boolean flag = false;
        
        for (char n_char : n_arr) {
            if (n_char != '0') flag = true;
            if (flag) {
                answer += String.valueOf(n_char);
            }
        }
        
        return answer;
    }
}