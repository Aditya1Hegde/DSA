class Solution {
    public int[] twoSum(int[] nums, int target) {
        return findPair(nums, target, 0);
    }

    // Outer loop: index i
    private int[] findPair(int[] nums, int target, int i) {
        if (i >= nums.length) {
            return new int[]{-1, -1}; // base case: not found
        }
        // Inner loop: index j
        int[] result = findInner(nums, target, i, 0);
        if (result[0] != -1) {
            return result; // pair found
        }
        return findPair(nums, target, i + 1); // check next i
    }

    // Inner loop: index j
    private int[] findInner(int[] nums, int target, int i, int j) {
        if (j >= nums.length) {
            return new int[]{-1, -1}; // end of inner loop
        }
        if (i != j && nums[i] + nums[j] == target) {
            return new int[]{i, j}; // found the pair
        }
        return findInner(nums, target, i, j + 1); // move j forward
    }
}
