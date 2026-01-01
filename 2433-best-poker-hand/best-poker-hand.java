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
        int maxCount=0;
        for(int i=0;i<ranks.length;i++){
            int count=0;
            for(int j=0;j<ranks.length;j++){
                if(ranks[i]==ranks[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
            }
        }
        if(maxCount>=3) return "Three of a Kind";
        if(maxCount==2) return "Pair";
    
    return "High Card";
    }
}