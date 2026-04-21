import java.io.*;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (String name : participant) {
            if (hashMap.containsKey(name)) {
                int hashMapValue = hashMap.get(name);
                hashMapValue++;
                hashMap.put(name, hashMapValue);
            } else {
                hashMap.put(name, 1);
            }
        }

        String answer = "";

        for (String name : completion) {
            if(hashMap.containsKey(name)) {
                int hashMapValue = hashMap.get(name);
                hashMapValue--;
                hashMap.put(name, hashMapValue);
            }
        }

        for (String name : participant) {
            if (hashMap.get(name) == 1) {
                answer = name;
            }
        }
        return answer;
    }
}