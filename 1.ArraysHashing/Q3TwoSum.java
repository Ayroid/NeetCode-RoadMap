import java.util.*;

class Solution {
    // Approach 1 - Iteration

    public int[] twoSumIterate(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    // Approach 2 - Using HashMap
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int diff = target - number;

            if (prevSum.containsKey(diff)) {
                return new int[] { prevSum.get(diff), i };
            }
            prevSum.put(number, i);
        }
        return new int[] {};
    }
}
