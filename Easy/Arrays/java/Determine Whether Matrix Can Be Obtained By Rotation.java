import java.util.Arrays;
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
   if (Arrays.deepEquals(mat, target)) {
                return true;
            }
for(int k=1;k<=3;k++){
            rotate(mat);
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        }
        return false;
    }
     public void rotate(int[][] mat) {
     for(int i=0;i<mat.length;i++){
         for(int j=i;j<mat[i].length;j++){
             if(i!=j){
                int temp = mat[i][j];  
                mat[i][j]=mat[j][i];  
                mat[j][i]=temp;
             }
     }
    }
     for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat.length/2;j++){
                int temp = mat[i][j];  
                mat[i][j]=mat[i][mat.length-j-1];  
                mat[i][mat.length-j-1]=temp;
             }
}
     }
    }

