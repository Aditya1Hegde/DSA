class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
      for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums.length;j++){
              if(!(i==j)){
                  int sum=nums[i]+nums[j];
                  if(target==sum){
                      arr[0]=i;
                      arr[1]=j;
                      return arr;
                  }
          }
      }
}
return arr;
    }
}