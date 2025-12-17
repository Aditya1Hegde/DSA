class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int currMax=Max(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=currMax){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
    public int Max(int[] candies){
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }
}