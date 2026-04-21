import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int number : nums) {
            hashMap.put(number, hashMap.getOrDefault(number, 0) + 1);
        }

        int haveAblePonkemonCount = nums.length / 2;

        haveAblePonkemonCount = Math.min(hashMap,size(), haveAblePonkemonCount)
        return haveAblePonkemonCount;
    }
}