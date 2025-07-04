class Solution {
    public void setZeroes(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        boolean[] a= new boolean[row];
        boolean[] b=new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    a[i]=true;
                    b[j]=true;
                }
            }
        }
        
        for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(a[i]|| b[j]){
                                arr[i][j]=0;
                            }
                        }
                    }
    }
    }