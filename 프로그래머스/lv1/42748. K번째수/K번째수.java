import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int f = 0;
        
        for (int[] command : commands) {
            int[] temporaryArray = new int[command[1] - command[0] + 1];
            
            int index = 0;
            for (int i = command[0]; i <= command[1]; i++) {
                temporaryArray[index] = array[i - 1];
                index++;
            }
            
            Arrays.sort(temporaryArray);
            
            answer[f] = temporaryArray[command[2] - 1];
            
            f++;
        }
        
        return answer;
    }
}