class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null){
            return;
        }
        int i,j,tmp;
        int len=matrix[0].length;
        for(i=0;i<len/2;i++){
            for(j=0;j<len;j++){
                tmp=matrix[i][j];
                matrix[i][j]=matrix[len-i-1][j];
                matrix[len-i-1][j]=tmp;
            }
        }
        for(i=0;i<len;i++){
            for(j=i;j<len;j++){
                tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
                
    }
}