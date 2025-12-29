class Solution {
    /**
     * Implement your solution here.
     * 
     * @param money int - Integer
     * @param children int - Integer
     * @return int - The result
     */
    public int distMoney(int money, int children) {
        // Your solution here
        if(children>money){
            return -1;
        }
        money-=children;
        int count7=money/7;
        int remainder=money%7;
        if(count7>=children){
        if(children==count7 && remainder==0){
            return children;
        }
        return children-1;
        }
        if(count7==children-1 && remainder==3){
            return count7-1;
        }
        return count7;
    }
}