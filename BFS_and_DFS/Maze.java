public class Maze {
    public static boolean dfs(int row,int col,int mat[][],boolean vis[][]){
        if(row==mat.length-1 && col==mat[0].length-1){
            return true;
        }
        if(mat[row][col]==0 || vis[row][col]){
            return false;
        }
        int rowdir[] = {0,1};
        int coldir[] = {1,0};
        for(int i =0;i<2;i++){
            int nrow = row + rowdir[i];
            int ncol = col + coldir[i];
            if(isValid(nrow,ncol,mat,vis)){
                if(dfs(nrow,ncol,mat,vis)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int row,int col,int mat[][],boolean vis[][]){
        if(row>=0 && row<mat.length && col>=0 && col<mat[0].length && mat[row][col]==1 && !vis[row][col]){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{1,1,0,0},
                        {0,1,1,0},
                        {0,0,1,1},
                        {0,0,0,1}};
        boolean vis[][] = new boolean[mat.length][mat[0].length];
        System.out.println(dfs(0,0,mat,vis));
    }
}
