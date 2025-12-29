class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length; // We derive n from the array itself.
        
        // 1. The First Anchor (i)
        for(int i = 0; i < n - 2; i++) {
            
            // 2. The Second Anchor (j)
            for(int j = i + 1; j < n - 1; j++) {
                
                // Early Rejection: Check condition A immediately
                if(Math.abs(arr[i] - arr[j]) > a) {
                    continue; 
                }
                
                // 3. The Third Anchor (k)
                for(int k = j + 1; k < n; k++) {
                    
                    // The Final Judgment: Check conditions B and C
                    if(Math.abs(arr[j] - arr[k]) <= b && 
                       Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}