class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        
        // We count how many multiples of 5, 25, 125... are inside n.
        // n / 5 gives the count of simple 5s.
        // The loop automatically handles 25, 125, etc.
        while (n > 0) {
            n /= 5;
            count += n;
        }
        
        return count;
    }
}