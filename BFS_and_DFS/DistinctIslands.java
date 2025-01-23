import java.util.*;
public class DistinctIslands {
    public static int NoofDistinctIslands(int mat[][]){
        Set<String> set = new HashSet<>();
        boolean vis[][] = new boolean[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1 && !vis[i][j]){
                    StringBuilder sb = new StringBuilder();
                    set.add(bfs(i,j,i,j,mat,vis,sb));
                }
            }
        }
        return set.size();
    }

    public static String bfs(int row,int col,int baserow,int basecol,int mat[][],boolean vis[][],StringBuilder sb){
        vis[row][col] = true;
        Queue<int[]> q = new LinkedList<>();
        int rowdir[] ={-1,1,0,0};
        int coldir[] ={0,0,-1,1};
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int curr[] = q.remove();
            sb.append(curr[0]-baserow).append(",").append(curr[1]-basecol).append(" ");
            for(int i =0;i<4;i++){
                int newrow = curr[0] + rowdir[i];
                int newcol = curr[1] + coldir[i];
                if(isValid(newrow,newcol,mat,vis)){
                    q.add(new int[]{newrow,newcol});
                    vis[newrow][newcol] = true;
                }
            }
        }
        return sb.toString();
    }

    public static boolean isValid(int row,int col,int mat[][],boolean vis[][]){
        if(row>=0 && row<mat.length && col>=0 && col<mat[0].length && mat[row][col]==1 && !vis[row][col]){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] grid = { {0, 0, 1, 0, 0, 0, 0}, 
                         {0, 1, 1, 0, 1, 1, 0}, 
                         {0, 1, 0, 0, 1, 1, 0}, 
                         {0, 0, 0, 0, 0, 0, 0}, 
                         {1, 1, 1, 0, 1, 0, 0}, 
                         {1, 1, 0, 0, 0, 0, 0} 
                    };

        System.out.println(NoofDistinctIslands(grid));
    }
}
