import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the result: Key = Number, Value = Its Next Greater Element
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // 1. Traverse nums2 to map out the "Next Greater" for everyone
        for (int num : nums2) {
            // While the current number is taller than the people on the stack...
            while (!stack.isEmpty() && stack.peek() < num) {
                // ...we found their next greater element!
                map.put(stack.pop(), num);
            }
            // Add the current number to the waiting list
            stack.push(num);
        }
        
        // 2. Answer the queries for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            // If the number is in the map, we found a greater element.
            // If not, it means it stayed in the stack until the end (no greater element found).
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
}