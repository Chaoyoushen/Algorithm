class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map tmp=new HashMap();
        int i,j,m,n;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(board[i][j]!='.'&&tmp.put(board[i][j],board[i][j])!=null){
                    return false;
                }
            }
            tmp.clear();
            for(j=0;j<9;j++){
                if(board[j][i]!='.'&&tmp.put(board[j][i],board[j][i])!=null){
                    return false;
                }
            }
            tmp.clear();
        }
        for(i=0;i<9;i=i+3){
            for(j=0;j<9;j=j+3){
                for(n=i;n<i+3;n++){
                    for(m=j;m<j+3;m++){
                        if(board[n][m]!='.'&&tmp.put(board[n][m],board[n][m])!=null){
                            return false;
                        }
                    }
                }   
                tmp.clear();
            }
        }
        return true;
    }
}