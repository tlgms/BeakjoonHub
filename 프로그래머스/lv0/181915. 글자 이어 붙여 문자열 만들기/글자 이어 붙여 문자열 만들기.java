class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] char_array = my_string.toCharArray();
        
        for (int index : index_list) {
            answer += String.valueOf(char_array[index]);
        }
        
        return answer;
    }
}