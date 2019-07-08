package com.vstaryw.code;

import java.util.HashMap;

/**
 * 两数之和
 * Created by Sumail on 2019/7/8 0008.
 */
public class L1_SumOfTwoNumbers {

    public static void main(String[] args) {
        int[] put = new int[]{3, 4, 5, 7};
        twoSum(put, 8);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val = map.get(nums[i]);
            if (val != null) {
                return new int[]{val, i};
            }
            map.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
