class Solution {
    public void duplicateZeros(int[] arr) {
        
        int zeroCount = 0;

        for(int i : arr){
            if(i == 0){
                zeroCount++;
            }
        }

        int i = arr.length-1;
        int j = (arr.length + zeroCount) -1;

        while(i!=j){

            insert(arr,i,j);
            j--;

            if(arr[i] == 0){
                insert(arr,i,j);
                j--;
            }

            i--;

        }

    }

    void insert(int arr[] , int i, int j)
    {
            if(j < arr.length)
            {
                arr[j] = arr[i];
            }
    }
}