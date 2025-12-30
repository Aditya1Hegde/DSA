class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=numOnes;
        if(k<=numOnes) return k;
        k=k-numOnes;
        if(k<=numZeros) return numOnes;
        k=k-numZeros;
        if(k<=numNegOnes){
            sum-=k;
        }
        if(k>numOnes+numZeros+numNegOnes) return numOnes+numZeros-numNegOnes;
        return sum;
        
       


    
}}