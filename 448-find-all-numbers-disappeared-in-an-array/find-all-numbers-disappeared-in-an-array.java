class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int val=Math.abs(nums[i]);
            int indexToMark=val-1;
            if(nums[indexToMark]>0){
                nums[indexToMark]=-nums[indexToMark];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}