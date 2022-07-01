class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] array=new int[r][c];
        if(r*c==mat.length*mat[0].length){
            int x=0;
            int y=0;
            for(int i=0; i<mat.length;i++){
                for(int j=0; j< mat[i].length;j++){
                    if(y<c){
                        array[x][y]=mat[i][j];
                        y++;
                    }
                    else{
                        array[x+1][0]=mat[i][j];
                        x++;
                        y=1;
                    }
                }
            }
            
          return array;  
        }
        else{
            return mat;
        }
        }
    }