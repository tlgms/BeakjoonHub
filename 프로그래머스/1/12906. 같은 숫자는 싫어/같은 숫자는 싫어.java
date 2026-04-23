import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Number> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty()) {
                stack.push(num);
                continue;
            }

            if (Integer.parseInt(stack.peek().toString()) != num) {
                stack.push(num);
            }
        }

        Integer[] stackArray = stack.toArray(new Integer[0]);
        
        int[] answer = new int[stackArray.length];
        
        for (int i = 0; i < stackArray.length; i++) {
            answer[i] = stackArray[i];
        }

        return answer;
    }
}