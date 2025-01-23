import java.util.*;
public class MaximumAreaOfIslands {
    public static int maxArea(int mat[][]){
        int area = 0;
        boolean vis[][] = new boolean[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1 && !vis[i][j]){
                    area = Math.max(bfs(i,j,mat,vis),area);
                }
            }
        }
        return area;
    }

    public static int bfs(int row,int col,int mat[][],boolean vis[][]){
        vis[row][col] = true;
        int rowdir[] ={-1,1,0,0};
        int coldir[] = {0,0,-1,1};
        Queue<int[]> q = new LinkedList<>();
        int area = 0;
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int cor[] = q.remove();
            area++;
            for(int i = 0;i<4;i++){
                int newrow = cor[0] + rowdir[i];
                int newcol = cor[1] + coldir[i];
                if(isValid(newrow,newcol,mat,vis)){
                    vis[newrow][newcol] = true;
                    q.add(new int[]{newrow,newcol});
                }
            }
        }
        return area;
    }

    public static boolean isValid(int row,int col ,int mat[][] , boolean vis[][]){
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

        System.out.println(maxArea(grid));
    }        
}
