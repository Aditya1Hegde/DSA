class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr={-1,-1};
      for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            int sum=nums[i]+nums[j];
                  if(target==sum){
                      arr[0]=i;
                      arr[1]=j;
                      return arr;
                  
          }
      }
}
return arr;
    }
}