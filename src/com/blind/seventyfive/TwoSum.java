package com.blind.seventyfive;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainderIdx = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (remainderIdx.containsKey(nums[i])) {
                result[0] = remainderIdx.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                remainderIdx.put(remainder, i);
            }
        }
        return result;
    }
}
