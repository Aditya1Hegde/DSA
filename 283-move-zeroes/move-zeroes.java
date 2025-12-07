class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int count=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
            else{
                count++;
            }
        }
        while(count!=0){
            arr[j]=0;
            j++;
            count--;
        }
        for(int i=0;i<j;i++){
            nums[i]=arr[i];
        }
    }
}