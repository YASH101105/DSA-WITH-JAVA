class Solution {
    public int numSpecial(int[][] mat) {
        int m= mat.length;
        int n = mat[0].length;
        int count = 0;
        for(int row= 0 ;row<m;row++){
            for(int col =0 ;col<n;col++){
                if(mat[row][col]==0){
                    continue;
                }
                 boolean special = true;
                for(int r = 0 ;r<m;r++){
                    if(r!=row && mat[r][col]==1){
                        special = false;
                        break;
                    }
                }
                for(int c = 0 ;c<n;c++){
                    if(c!=col && mat[row][c]==1){
                        special = false;
                        break;
                    }
                }
                if(special==true){
                    count++;
                }
            }
        }
        return count;
}
}