import java.util.*;
public class Ham_Cycle {
    static int start=0;
    static boolean vis[];
    static List<Integer> hc=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int graph[][]=new int[n][n];
        vis=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        vis[0]=true;
        hc.add(0);
        if(!getHamiltanionCycle(graph,0)) System.out.println("No Solution");
        sc.close();
    } 
    static boolean getHamiltanionCycle(int graph[][],int p){
        if(graph[p][start]==1 && hc.size()==graph.length){
            hc.add(start);
            System.out.println(hc);
            return true;
        }
        for(int i=0;i<graph.length;i++){
            if(graph[p][i]==1 && !vis[i]){
                vis[i]=true;
                hc.add(i);
                if(getHamiltanionCycle(graph, i))  return true;
                Integer temp=i;
                hc.remove(temp);
                vis[i]=false;
            }
        }
        return false;
    }
}
