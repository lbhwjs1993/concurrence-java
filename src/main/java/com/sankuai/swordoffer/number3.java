package com.sankuai.swordoffer;

public class number3 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 4, 2, 6, 4};
        int[] duplication = new int[nums.length];
        duplicate(nums, nums.length, duplication);
        //for (int i = 0; i < nums.length; i++) {
        //    System.out.println("nums[" + i + "]is :" + nums[i]);
        //}

        //for (int i = 0; i < duplication.length; i++) {
        //    System.out.println("duplication[" + i + "] is :" + duplication[i]);
        //}
    }

    public static boolean duplicate(int[] nums, int length, int[] duplication) {

        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
