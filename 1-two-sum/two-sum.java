class Solution {
    public int[] twoSum(int[] nums, int target) {
        return findPair(nums, target, 0);
    }

    private int[] findPair(int[] nums, int target, int i) {
        if (i >= nums.length) {
            return new int[]{-1, -1}; 
        }
        
        int[] result = findInner(nums, target, i, 0);
        if (result[0] != -1) {
            return result; 
        }
        return findPair(nums, target, i + 1); 
    }


    private int[] findInner(int[] nums, int target, int i, int j) {
        if (j >= nums.length) {
            return new int[]{-1, -1};
        }
        if (i != j && nums[i] + nums[j] == target) {
            return new int[]{i, j}; 
        }
        return findInner(nums, target, i, j + 1); 
    }
}
