class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean isFlush=true;
        for(int i=1;i<suits.length;i++){
            if(suits[i]!=suits[0]){
                isFlush=false;
                break;
            }
        }
        if(isFlush){
            return "Flush";
        }
        Map<Integer,Integer> Map=new HashMap<>();
        

        for(int r:ranks){
            Map.put(r,Map.getOrDefault(r,0)+1);
        }
        int Frequency=Collections.max(Map.values());
        if(Frequency>=3) return "Three of a Kind";
        if(Frequency==2) return "Pair";
    
    return "High Card";
    }
}