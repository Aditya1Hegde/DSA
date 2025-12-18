class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //j=0--type
        //j=1--color
        //j=2--name
        int match=0;
        int col=0;
    if(ruleKey.equals("type")){
        col=0;
    }else if(ruleKey.equals("color")){
        col=1;
    }else{
        col=2;
    }
        for(int i=0;i<items.size();i++){
                    if(items.get(i).get(col).equals(ruleValue)){
                        match++;
                    }
        }
        return match;
    }
}