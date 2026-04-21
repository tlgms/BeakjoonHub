class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        
        int fix = 0;
        for (char ch : arr) {
            switch(ch) {
                case '(':
                    fix++;
                    break;
                case ')':
                    fix--;
            }
            
            if (fix == -1) {
                return false;
            }
        }
        
        if(fix != 0) {
            answer = false;
        }
        
        return answer;
    }
}