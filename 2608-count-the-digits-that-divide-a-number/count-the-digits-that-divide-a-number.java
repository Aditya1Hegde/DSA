class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num; // The sacrifice. We destroy this to find digits.
        
        while (temp > 0) {
            int digit = temp % 10; // Extract the current digit.
            
            // 1. Check if the digit is valid (not 0).
            // 2. Check if the whole (num) is divisible by the part (digit).
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            
            // Remove the digit and move to the next.
            temp /= 10;
        }
        
        return count;
    }
}