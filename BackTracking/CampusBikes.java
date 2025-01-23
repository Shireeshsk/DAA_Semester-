import java.util.*;
public class CampusBikes {
    static int ans = Integer.MAX_VALUE;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int man[][] = new int[m][2];
        int bikes[][] = new int[n][2];
        for(int i = 0;i<m;i++){
            man[i][0] = sc.nextInt();
            man[i][1] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            bikes[i][0] = sc.nextInt();
            bikes[i][1] = sc.nextInt();
        }
        minDist(0,new boolean[n],bikes,man,0);
        System.out.println(ans);
        sc.close();
    }
    public static void minDist(int m ,boolean[] visited,int bikes[][],int man[][],int dist){
        if(m>=man.length){
            ans = Math.min(ans,dist);
            return;
        }
        for(int i = 0;i<bikes.length;i++){
            if(visited[i]==false){
                visited[i] = true;
                minDist(m+1,visited,bikes,man,dist+calDist(man[m],bikes[i]));
                visited[i] = false;
            }
        }
    }
    public static int calDist(int man[] , int bikes[]){
        return Math.abs(man[0]-bikes[0])+Math.abs(man[1]-bikes[1]);
    }
}
 