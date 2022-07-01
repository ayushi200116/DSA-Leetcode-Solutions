class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;int j=0;
        for(int i=0; i< mat.length ; i++){
                    sum=sum+mat[i][j];
            j++;
            }
        j=mat.length-1;
        for(int i=0; i< mat.length ; i++){
                if(i!=j){
                    sum=sum+mat[i][j];
                }
            j--;
            }
         return sum;
        }
        
    }